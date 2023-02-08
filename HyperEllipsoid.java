package thesis.Benchmarks;

import java.util.Random;

/**
 * Hyperellipsoid function.
 */
public class HyperEllipsoid extends Function {
    
    public HyperEllipsoid (Random r, int n) {
        
        super(r, n, -5.12, 5.12);

    } // Constructor

    @Override
    public double compute (double [] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++)
            sum += (i + 1) * x[i] * x[i];
        return sum;
    } // compute

    @Override
    public String getName () {
        return "Hyperellipsoid";
    } // getName

} // F7
