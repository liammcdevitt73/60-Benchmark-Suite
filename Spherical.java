package thesis.Benchmarks;

import java.util.Random;

/**
 * Spherical function.
 */
public class Spherical extends Function {
    
    public Spherical (Random r, int n) {

        super(r, n, -100, 100);

    } // Constructor

    @Override
    public double compute (double [] x) {
        double result = 0;
        for (int i = 0; i < x.length; i++)
            result += Math.pow(x[i], 2);
        return result;
    } // compute

    @Override
    public String getName () {
        return "Spherical";
    } // getName

} // Spherical
