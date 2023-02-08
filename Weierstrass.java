package thesis.Benchmarks;

import java.util.Random;

/**
 * Weierstrass function.
 */
public class Weierstrass extends Function {
    
    double a = 0.5;
    double b = 3;
    double subtractConstant;

    public Weierstrass (Random r, int n) {

        super(r, n, -0.5, 0.5);

        // Calculate the subtract constant
        subtractConstant = 0;
        for(int i = 1; i <= 20; i++)
            subtractConstant += Math.pow(a, i) * Math.cos(Math.PI * Math.pow(b, i));
        subtractConstant *= n;

    } // Constructor

    @Override
    public double compute (double [] x) {
        double result = 0;
        for(int i = 0; i < x.length; i++) 
            for(int j = 1; j <= 20; j++) 
                result += Math.pow(a, j)* Math.cos(2 * Math.PI * Math.pow(b, j) * (x[i] + 0.5));
        return result - subtractConstant;
    } // compute

    @Override
    public String getName () {
        return "Weierstrass";
    } // getName

} // Weierstrass
