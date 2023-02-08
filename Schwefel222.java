package thesis.Benchmarks;

import java.util.Random;

/**
 * Schwefel 2.22 function.
 */
public class Schwefel222 extends Function {
    
    public Schwefel222 (Random r, int n) {

        super(r, n, -10, 10);

    } // Constructor

    @Override
    public double compute (double [] x) {
        double sum = Math.abs(x[0]);
        double product = Math.abs(x[0]);
        for(int i = 1; i < x.length; i++) {
            sum += Math.abs(x[i]);
            product *= Math.abs(x[i]);
        }
        return (sum + product);
    } // compute

    @Override
    public String getName () {
        return "Schwefel 2.22";
    } // getName

} // Schwefel222
