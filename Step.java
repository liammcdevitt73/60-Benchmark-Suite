package thesis.Benchmarks;

import java.util.Random;

/**
 * Step function.
 */
public class Step extends Function {
    
    public Step (Random r, int n) {

        super(r, n, -100, 100);

    } // Constructor

    @Override
    public double compute (double [] x) {
        double result = 0;
        for(int i = 0; i < x.length; i++)
            result += Math.pow(Math.floor(x[i] + 0.5), 2);
        return result;
    } // compute

    @Override
    public String getName () {
        return "Step";
    } // getName

} // Step
