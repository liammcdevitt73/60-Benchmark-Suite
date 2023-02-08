package thesis.Benchmarks;

import java.util.Random;

/**
 * Represents a composition of functions.
 * 
 * A composition function should be non-rotated, non-noisy, and non-shifted,
 * since the sub-functions have their own transformations.
 */
public class CompositionFunction extends Function {

    public int         numFs = 10; // Number of sub-functions

    public double   [] y;          // An estimated optimal vector - Initialized in Defaults
    public double   [] shifts;     // A shift constant is used for each component to be consistent with the rest of this suite.
    public double      C;          // Constant used in all evaluations
    public double   [] bias;       // Bias for each sub-function

    public Function [] Fs;         // Holds all sub-functions
    public double   [] sigmas;     // Used to control the coverage range of underlying
    public double   [] lambdas;    // Used to stretch or compress functions
    public double      mainBias;   // Bias for overall function
    
    public CompositionFunction (Random r, int n) {

        super(r, n, -5, 5);

        // Initialize globals
        shifts  = new double   [numFs];
        bias    = new double   [numFs];
        Fs      = new Function [numFs];
        sigmas  = new double   [numFs];
        lambdas = new double   [numFs];

    } // Constructor

    @Override
    public double compute (double [] x) {
        
        double [] w = new double [numFs];
        double [] fit = new double [numFs];
        double [] estFitMax = new double [numFs];

        for (int i = 0; i < numFs; i++) {
            double [] tmp = new double [n];
            shift(x, shifts[i], tmp);
            double sum = 0;
            for (int j = 0; j < n; j++)
                sum += Math.pow(tmp[j], 2);
            w[i] = Math.exp(-(sum / (2.0 * n * Math.pow(sigmas[i], 2))));
            div(tmp, lambdas[i], tmp);
            // The underlying function should be configured to perform the rotation,
            // but it should NOT apply any shift.
            fit[i] = Fs[i].f(tmp);
            div(y, lambdas[i], tmp);
            estFitMax[i] = Fs[i].f(tmp);
            fit[i] = C * (fit[i] / estFitMax[i]);
        }

        double SW = 0;
        for (int i = 0; i < numFs; i++)
            SW += w[i];

        double maxW = w[0];
        for (int i = 0; i < numFs; i++)
            maxW = (maxW > w[i]) ? maxW : w[i];

        double weightConst = 1 - Math.pow(maxW, 10);
        for (int i = 0; i < numFs; i++) {
            if (Math.abs(w[i] - maxW) > 0.0000000000001)
                w[i] *= weightConst;
            w[i] /= SW;
        }

        double sum = 0;
        for (int i = 0; i < numFs; i++)
            sum += w[i] * (fit[i] + bias[i]);

        return sum + mainBias;

    } // compute

    @Override
    public String getName () {
        String name = "";
        for (int i = 0; i < Fs.length; i++)
            name += (i != Fs.length - 1) ? Fs[i].getName() + " | " : Fs[i].getName();
        return "Composition: {" + name + "}";
    } // getName

    // Shift and div are performed here, but the underlying function is still responsible for the rotation
    private void div (double [] x, double y, double [] dst) {
        for (int i = 0; i < n; i++)
            dst[i] = x[i] / y;
    } // div

    private void shift (double [] x, double y, double [] dst) {
        for (int i = 0; i < n; i++)
            dst[i] = x[i] - y;
    } // shift

} // CompositionFunction
