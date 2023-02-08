package thesis.Benchmarks;

import java.util.Random;
import thesis.Helper;

/**
 * Base abstract class for all benchmark problems.
 * 
 * @author Liam McDevitt
 * 
 * Function implementations are based on implementations by 
 * Cody Dennis & Kyle Harrison.
 * 
 * Date: 2021/11/06 -> 2022/03/03
 */
public abstract class Function {

    public Random r;    // Instance of random

    public int    n;     // Number of dimensions
    public double min;   // Minimum bound in search space
    public double max;   // Maximum bound in search space
    public double range; // Range of search space values

    public boolean isRotatedFunction;
    public boolean isElementShiftedFunction;
    public boolean isShiftedFunction;
    public boolean isDiscreteFunction;
    public boolean isNoisyFunction;

    public boolean isBounded;

    public double [] elementShift;

    public double lambda;
    public double beta;
    public double noiseMean;
    public double noiseStd;
    public double [][] rotMat;

    /**
     * Initializes a problem (i.e. an objective function to optimize).
     * @param r    Instance of random
     * @param n    Number of dimensions
     * @param min  Min bound
     * @param max  Max bound
     */
    public Function (Random r, int n, double min, double max) {

        // Initializing global variables
        this.r     = r;

        this.n     = n;
        this.min   = min;
        this.max   = max;
        this.range = Math.abs(max - min);

        isRotatedFunction        = false;
        isElementShiftedFunction = false;
        isShiftedFunction        = false;
        isDiscreteFunction       = false;
        isNoisyFunction          = false;

        isBounded = true;

    } // Constructor

    /**
     * Objective function.
     * @param x The decision vector.
     * @return  double, f(x).
     */
    public abstract double compute (double [] x); // Changing the name to compute to match CEC

    /**
     * @return String: the name of the function
     */
    public abstract String getName ();

    /**
     * @return String: the short name of the function
     */
    public String getShortName () { return ""; };

    // Adding these gets to make them more inline with the CEC implementation for testing
    public double getMin () {
        return min;
    } // getMin

    public double getMax () {
        return max;
    } // getMin

    public int getDimension () {
        return n;
    } // getDimension

    public double getRange () {
        return range;
    } // getRange

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // These are all copied from Cody's work
    // I may move these to a different class

    /**
     * Performs matrix multiplication between matrix a and matrix b.
     * The resulting matrix is saved in matrix a.
     * @param a First matrix
     * @param b Second matrix
     */
    public void matMul (double [][] a, double [][] b) {
        for (int i = 0; i < n; i++) {
            double [] result = new double [n];
            for (int j = 0; j < n; j++) {
                result[j] = 0;
                for (int k = 0; k < n; k++)
                    result[j] += a[i][k] * b[k][j];
            }
            for (int k = 0; k < n; k++)
                a[i][k] = result[k];
        }
    } // matMul

    public boolean attemptOrthogonalMatrix (double [][] M) {

        int i, j, k;  // Loop indices
        double dp;    // Dot product

        // Initialize a random matrix
        for (i = n - 1; i >= 0; i--) {
            for (j =  n - 1; j >= 0; j--) {
                M[i][j] = Helper.normalRandom(r, 0, 1);
            }
        }

        // Main loop of gram/schmidt
        for (i = n - 1; i >= 0; i--) {
            for (j = n - 1; j > i; j--) {
                // Dot product
                dp = 0.0;
                for (k = n - 1; k >= 0; k--)
                    dp += (M[i][k] * M[j][k]);
                // Subtract
                for (k = n - 1; k >= 0; k--)
                    M[i][k] -= (dp * M[j][k]);
            }
            // Normalize
            dp = 0.0;
            for (k = n - 1; k >= 0; k--)
                dp += Math.pow(M[i][k], 2);
            
            // Linear dependency -> restart
            if (dp <= 0)
                return false;  
            dp = (1 / Math.sqrt(dp));
            for (k = n - 1; k >= 0; k--)
                M[i][k] *= dp;
        }

        return true;

    } // attemptOrthogonalMatrix

    /**
     * Perform orthonormal transformation
     */
    public void initOrtho () {
        rotMat = new double [n][n];
        while(!attemptOrthogonalMatrix(rotMat));
        isRotatedFunction = true;
    } // initOrtho

    /**
     * Perform linear transformation
     * @param condition
     */
    public void initLinear (double condition) {

        double [][] x = new double [n][n];
        double [][] y = new double [n][n];

        while(!attemptOrthogonalMatrix(x));

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                y[i][j] = (i == j) ? Math.pow(condition, r.nextDouble()) : 0;

        matMul(x, y);

        while(!attemptOrthogonalMatrix(y));

        matMul(x, y);

        rotMat = x;

        isRotatedFunction = true;

    } // initLinear

    public void addNoise (double [] x) {
        for (int i = 0; i < n; i++)
            x[i] += Helper.normalRandom(r, noiseMean, noiseStd);
    } // addNoise

    public void shift (double [] x) {
        for (int i = 0; i < n; i++)
            x[i] -= lambda;
    } // shift

    public void elementwiseShift (double [] x) {
        for (int i = 0; i < n; i++)
            x[i] -= elementShift[i];
    } // elementwiseShift

    // Not sure if we use this yet - Cody wrote it for random rotations
    public void rotate (double [] x) {
        double [] tmp = new double [n];
        for (int i = 0; i < n; i++) {
            tmp[i] = 0;
            for (int j = 0; j < n; j++)
                tmp[i] += rotMat[i][j] * x[j];
        }
        for (int i = 0; i < n; i++)
            x[i] = tmp[i];
    } // rotate

    /**
     * X will be continuous close to 0, and made discrete otherwise.
     * This should be applied after the function is shifted.
     * @param x Vector we're discretizing
     */
    public void discretize (double [] x) {
        for (int i = 0; i < n; i++)
            if (Math.abs(x[i]) >= 0.5) // Cody's was (fabs(x[i] >= 0.5)), but the abs was around the conditional.
                x[i] = Math.round(2 * x[i]) / 2.0;
    } // discretize

    public void setRotation (String type, double condition) {
        if (!isRotatedFunction) {
            if (type.compareTo("ortho") == 0) initOrtho();
            else if (type.compareTo("linear") == 0) initLinear(condition);
            else {
                System.out.println("Rotation type not recognized!");
                System.exit(1);
            }
            isRotatedFunction = true;
        }
    } // setRotation

    public void setShift (double lambda, double beta) {
        if (!isShiftedFunction && !isElementShiftedFunction) {
            isElementShiftedFunction = false;
            isShiftedFunction = true;
            this.lambda = lambda;
            this.beta = beta;
        }
    } // setShift

    public void setShift (double [] x, double beta) {
        if (!isShiftedFunction && !isElementShiftedFunction) {
            isElementShiftedFunction = true;
            isShiftedFunction = false;
            elementShift = new double [n];
            for (int i = 0; i < n; i++)
                elementShift[i] = x[i];
            this.beta = beta;
        }
    } // setShift

    public double f (double [] x) {

        // Copy vector to a temporary one
        double [] tmp = new double [n];
        for (int i = 0; i < n; i++) tmp[i] = x[i];

        // Perform operations if required
        if      (isNoisyFunction)          addNoise(tmp);
        if      (isShiftedFunction)        shift(tmp);
        else if (isElementShiftedFunction) elementwiseShift(x);
        if      (isDiscreteFunction)       discretize(tmp);
        if      (isRotatedFunction)        rotate(tmp);

        // Compute result
        double result = compute(tmp);

        // If shifted, add beta term to final fitness
        if (isShiftedFunction || isElementShiftedFunction)
            result = result + beta;

        // If number cannot be properly represented, set to worse case
        if (!Double.isFinite(result))
            result = Double.MAX_VALUE;

        return result;

    } // f

    public void setDiscrete () {
        isDiscreteFunction = true;
    } // setDiscrete

} // Function