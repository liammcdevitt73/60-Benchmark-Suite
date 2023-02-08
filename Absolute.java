package thesis.Benchmarks;

import java.util.Random;

/**
 * Absolute value function.
 */
public class Absolute extends Function {

    public Absolute (Random r, int n) {

        super(r, n, -100, 100);

    } // Constructor

    @Override
    public double compute (double [] x) {
        double result = 0;
        for (int i = 0; i < x.length; i++)
            result += Math.abs(x[i]);
        return result;
    } // compute

    @Override
    public String getName () {
        return "Absolute";
    } // getName

} // F1