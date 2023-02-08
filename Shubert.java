package thesis.Benchmarks;

import java.util.Random;

/**
 * Shubert function.
 */
public class Shubert extends Function {
    
    public Shubert (Random r, int n) {

        super(r, n, -10, 10);

    } // Constructor

    @Override
    public double compute (double [] x) {
        double result = 1.0;
        for(int i = 0; i < x.length; i++) {
            double tmp = 0;
            for(int j = 1; j < 6; j++) {
                tmp += j * Math.cos(((j + 1.0) * x[i]) + j);
            }
            result *= tmp;
        }
        return result;
    } // compute

    @Override
    public String getName () {
        return "Shubert";
    } // getName
    
} // Shubert
