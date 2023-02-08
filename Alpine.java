package thesis.Benchmarks;

import java.util.Random;

/**
 * Alpine Function.
 */
public class Alpine extends Function {
    
    public Alpine (Random r, int n) {

        super(r, n, -10, 10);

    } // Constructor

    @Override
    public double compute (double [] x) {
        double result = 0;
        for (int i = 0; i < x.length; i++)
            result += Math.abs(x[i] * Math.sin(x[i]) + 0.1 * x[i]);
        return result;
    } // compute

    @Override
    public String getName () {
        return "Alpine";
    } // getName

} // F3