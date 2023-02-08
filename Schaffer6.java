package thesis.Benchmarks;

import java.util.Random;

/**
 * Generalized Schaffer 6 function.
 */
public class Schaffer6 extends Function {
    
    public Schaffer6 (Random r, int n) {
        
        super(r, n, -100, 100);

    } // Constructor

    @Override
    public double compute (double [] x) {
        double sum = 0;
        for (int i = 0; i < x.length - 1; i++) {
            double xi = x[i];
            double xj = x[i + 1];

            double xi2 = xi * xi;
            double xj2 = xj * xj;

            double sinSquare = Math.sin(Math.sqrt((100 * xi2) + xj2));
            sinSquare *= sinSquare;

            double squareVal = xi2 - (2 * xi * xj) + xj2;
            squareVal *= squareVal;

            sum += 0.5 + ((sinSquare - 0.5) / (1 + (0.001 * squareVal)));
        }
        return sum;
    } // compute

    @Override
    public String getName () {
        return "Schaffer 6";
    } // getName

} // F15
