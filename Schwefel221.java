package thesis.Benchmarks;

import java.util.Random;

/**
 * Schwefel 2.21 function.
 */
public class Schwefel221 extends Function {
    
    public Schwefel221 (Random r, int n) {

        super(r, n, -100, 100);

    } // Constructor

    @Override
    public double compute (double [] x) {
        double max = Math.abs(x[0]);
        for(int i = 1; i < x.length; i++) {
            double tmp = Math.abs(x[i]);
            max = (tmp > max) ? tmp : max;
        }
        return max;
    } // compute

    @Override
    public String getName () {
        return "Schwefel 2.21";
    } // getName

} // Schwefel221
