package thesis.Benchmarks;

import java.util.Random;

/**
 * Vincent function.
 */
public class Vincent extends Function {
    
    public Vincent (Random r, int n) {

        super(r, n, 0.25, 10);

    } // Constructor

    // Cody
    @Override
    public double compute (double [] x) {
        double sum = 0;
        for(int i = 0; i < x.length; i++)
            sum += Math.sin(10 * Math.sqrt(x[i]));
        return -(1 + sum);
    } // compute

    // // Kyle
    // @Override
    // public double compute (double [] x) {
    //     double sum = 0;
    //     for(int i = 0; i < x.length; i++)
    //         sum += Math.sin(10 * Math.log(x[i]));
    //     return -sum;
    // } // compute

    @Override
    public String getName () {
        return "Vincent";
    } // getName

} // Vincent
