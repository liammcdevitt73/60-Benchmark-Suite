package thesis.Benchmarks;

import java.util.Random;

/**
 * Michalewicz function.
 */
public class Michalewicz extends Function {
    
    public Michalewicz (Random r, int n) {
        
        super(r, n, 0, Math.PI);

    } // Constructor

    @Override
    public double compute (double [] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++)
            sum += Math.sin(x[i]) * Math.pow(Math.sin(((i + 1) * x[i] * x[i]) / Math.PI), 20);
        return -sum;
    } // compute

    @Override
    public String getName () {
        return "Michalewicz";
    } // getName

} // F8
