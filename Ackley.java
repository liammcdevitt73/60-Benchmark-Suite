package thesis.Benchmarks;

import java.util.Random;

/**
 * Ackley function.
 */
public class Ackley extends Function {
    
    public Ackley (Random r, int n) {

        super(r, n, -32.768, 32.768); // Malan has -32.0 and 32.0 instead of -32.768 and 32.768.

    } // Constructor

    @Override
    public double compute (double [] x) {
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < x.length; i++) {
            sum1 += Math.pow(x[i], 2);
            sum2 += Math.cos(2.0 * Math.PI * x[i]);
        }
        sum1 = -0.2 * Math.sqrt(sum1 / x.length);
        sum2 /= x.length;
        return ((-20.0 * Math.exp(sum1)) - Math.exp(sum2)) + 20.0 + Math.E;
    } // compute

    @Override
    public String getName () {
        return "Ackley";
    } // getName

} // F2