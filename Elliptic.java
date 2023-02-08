package thesis.Benchmarks;

import java.util.Random;

/**
 * Elliptic function.
 */
public class Elliptic extends Function {
    
    public Elliptic (Random r, int n) {
        
        super(r, n, -100, 100);

    } // Constructor

    @Override
    public double compute (double [] x) {
        double sum = 0;
        double cons = 1000000;
        for (int j = 0; j < n; j++)
            sum += Math.pow(cons, (j + 0.0) / (n - 1.0)) * (x[j] * x[j]);
        return sum;
    } // compute

    @Override
    public String getName () {
        return "Elliptic";
    } // getName

} // F5
