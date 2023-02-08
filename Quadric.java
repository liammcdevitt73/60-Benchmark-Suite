package thesis.Benchmarks;

import java.util.Random;

/**
 * Quadric function.
 */
public class Quadric extends Function {
    
    public Quadric (Random r, int n) {
        
        super(r, n, -100, 100);

    } // Constructor

    @Override
    public double compute (double [] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            double temp = 0;
            for (int j = 0; j <= i; j++)
                temp += x[j];
            sum += temp * temp;
        }
        return sum;
    } // compute

    @Override
    public String getName () {
        return "Quadric";
    } // getName

} // F10
