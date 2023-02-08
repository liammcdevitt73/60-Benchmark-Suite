package thesis.Benchmarks;

import java.util.Random;

/**
 * F8F2 function.
 * 
 * This function is the summation of a Rosenbrock function inside of a 
 * Griewank's function for each dimension.
 * 
 * F8: Griewank's function
 * F2: Rosenbrock's function
 * 
 * Used in the CEC2005 Rotated Hybrid Composite Function as f5 and f6.
 */
public class F8F2 extends Function {
    
    public F8F2 (Random r, int n) {

        super(r, n, -3, 1);

    } // Constructor

    @Override
    public double compute (double [] x) {
        double result = 0;
        for(int i = 0; i < x.length - 1; i++) {
            double tmp = F2(x[i], x[i + 1]);
            result += (Math.pow(tmp, 2) / 4000) - Math.cos(tmp / Math.sqrt(i + 1)) + 1; 
        }
        return result;
    } // compute

    @Override
    public String getName () {
        return "F8F2";
    } // getName

    /**
     * Rosenbrock function.
     * @param x1  Current value of the vector at a particular dimension
     * @param x2  The value of in the vector at the next dimension
     * @return    double: computed function value
     */
    private double F2 (double x1, double x2) {
        return 100 * Math.pow((x1 * x1) - x2, 2) + Math.pow(x1 - 1, 2);
    } // F2

} // F8F2
