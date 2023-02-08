package thesis.Benchmarks;

import java.util.Random;

/**
 * Saloman function.
 */
public class Saloman extends Function {
    
    public Saloman (Random r, int n) {
        
        super(r, n, -100, 100);

    } // Constructor

    @Override
    public double compute (double [] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++)
            sum += x[i] * x[i];
        return -Math.cos(2 * Math.PI * Math.sqrt(sum)) + (0.1 * Math.sqrt(sum)) + 1;
    } // compute

    @Override
    public String getName () {
        return "Saloman";
    } // getName

} // F14
