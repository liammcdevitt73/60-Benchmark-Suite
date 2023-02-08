package thesis.Benchmarks;

import java.util.Random;

/**
 * Quartic function.
 */
public class Quartic extends Function {
    
    public Quartic (Random r, int n) {
        
        super(r, n, -1.28, 1.28);

    } // Constructor

    @Override
    public double compute (double [] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            double temp = x[i] * x[i];
            sum += (i + 1) * temp * temp;
        }
        return sum;
    } // compute

    @Override
    public String getName () {
        return "Quartic";
    } // getName

} // F11