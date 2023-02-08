package thesis.Benchmarks;

import java.util.Random;

/**
 * Rosenbrock function.
 */
public class Rosenbrock extends Function {
    
    public Rosenbrock (Random r, int n) {
        
        super(r, n, -30, 30);

    } // Constructor

    @Override
    public double compute (double [] x) {
        double sum = 0;
        for (int i = 0; i < x.length - 1; i++) {
            double a = x[i];
            double b = x[i + 1];
            double c = b - a * a;
            double d = a - 1;
            sum += (100 * c * c) + (d * d);
        }
        return sum;
    } // compute

    @Override
    public String getName () {
        return "Rosenbrock";
    } // getName

} // F13
