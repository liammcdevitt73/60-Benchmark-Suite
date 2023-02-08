package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 21.
 * 
 * Function 11 with noise.
 */
public class F11N extends F11 {
    
    public F11N (Random r, int n) {
        super(r, n);
        isNoisyFunction = true;
        noiseMean = 0;
        noiseStd = 1;
    } // Constructor

    public String getName () {
        return "Quartic -> Noisy";
    } // getName

    public String getShortName () { return "F11N"; } // getShortName

} // F11N
