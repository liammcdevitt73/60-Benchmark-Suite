package thesis.Benchmarks.Functions;

import java.util.Random;
import thesis.Helper;
import thesis.Benchmarks.Function;

/**
 * Function 53.
 */
public class F29 extends F28 {

    // Create an F28 function to use it's compute function
    Function f28;
    
    public F29 (Random r, int n) {
        super(r, n);
        f28 = new F28(r, n);
    } // Constructor

    // These are Cody's words
    // ----------------------
    // Remember, the composition function class is basically a hack. 
    // We set all of the shift, rotation, noisy settings to None for the outer class, and then in eval we handled it as needed.
    // i.e. the call to f basically just returns the output of eval.
    // For things to continue behaving nicely DO NOT redefine isNosiy, isRotated, or isShifted.
    // Here we just need to get the F28 output, and then add some noise.
    @Override
    public double compute (double [] x) {
        return ((f28.compute(x) - mainBias) * (1 + (0.2 * Math.abs(Helper.normalRandom(r, 0, 1))))) + mainBias;
    } // compute

    public String getShortName () { return "F29"; } // getShortName

} // F29
