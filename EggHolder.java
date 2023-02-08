package thesis.Benchmarks;

import java.util.Random;

/**
 * Egg Holder Function.
 */
public class EggHolder extends Function {
    
    public EggHolder (Random r, int n) {

        super(r, n, -512, 512);

    } // Constructor

    @Override
    public double compute (double [] x) {
        double sum = 0;
        for(int i = 0; i < n - 1; i++)
            sum += (-((x[i+1]+47)*Math.sin(Math.sqrt(Math.abs(x[i+1] + (x[i]/2) + 47))))+(Math.sin(Math.sqrt(Math.abs(x[i]-(x[i+1]+47))))*(-x[i])));
        return sum;
    } // compute

    @Override
    public String getName () {
        return "Egg Holder";
    } // getName

} // F4
