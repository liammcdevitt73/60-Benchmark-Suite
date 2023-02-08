package thesis.Benchmarks;

import java.util.Random;

/**
 * Norwegian function.
 */
public class Norwegian extends Function {
    
    public Norwegian (Random r, int n) {
        
        super(r, n, -1.1, 1.1);

    } // Constructor

    @Override
    public double compute (double [] x) {
        double product = 1;
        for (int i = 0; i < x.length; i++)
            product *= Math.cos(Math.PI * Math.pow(x[i], 3)) * ((99.0 + x[i]) / 100.0);
        return product;
    } // compute

    @Override
    public String getName () {
        return "Norwegian";
    } // getName

} // F9
