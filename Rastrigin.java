package thesis.Benchmarks;

import java.util.Random;

/**
 * Rastrigin function.
 */
public class Rastrigin extends Function {
    
    public Rastrigin (Random r, int n) {
        
        super(r, n, -5.12, 5.12);

    } // Constructor

    @Override
    public double compute (double [] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++)
            sum += x[i] * x[i] - 10 * Math.cos(2 * Math.PI * x[i]);
        return 10 * x.length + sum;
    } // compute

    @Override
    public String getName () {
        return "Rastrigin";
    } // getName

} // F12
