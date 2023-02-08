package thesis.Benchmarks;

import java.util.Random;

/**
 * Schwefel 1.2 function.
 */
public class Schwefel12 extends Function {
    
    public Schwefel12 (Random r, int n) {

        super(r, n, -100, 100);

    } // Constructor

    @Override
    public double compute (double [] x) {
        double sum = 0;
        for(int i = 0; i < x.length; i++) {
            double tmpSum = 0;
            for(int j = 0; j < i; j++) 
                tmpSum += x[j];
            sum += tmpSum * tmpSum;
        }
        return sum;
    } // compute

    @Override
    public String getName () {
        return "Schwefel 1.2";
    } // getName

} // Schwefel12
