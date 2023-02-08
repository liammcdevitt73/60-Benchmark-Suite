package thesis.Benchmarks;

import java.util.Random;

/**
 * Griewank function.
 */
public class Griewank extends Function {
    
    public Griewank (Random r, int n) {
        
        super(r, n, -600, 600);

    } // Constructor

    @Override
    public double compute (double [] x) {
        double sumSquare = 0;
        double prodCos = 1;
        for (int i = 0; i < x.length; i++) {
            sumSquare += x[i] * x[i];
            prodCos *= Math.cos(x[i] / Math.sqrt(i + 1));
        }
        return 1 + sumSquare / 4000 - prodCos;
    } // compute

    @Override
    public String getName () {
        return "Griewank";
    } // getName

} // F6
