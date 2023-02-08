package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 50.
 */
public class F26S extends F26 {
    
    public F26S (Random r, int n) {
        super(r, n);
        // Cody's Reasoning for shifting values (I'm copying Cody's implementation, so I'll do the same thing).
        // "Engelbrecht's and Kyle's paper say it should be +1.
        // However, they define their shift as x -= lambda and the CEC definitions define the shift for this function as + 1.
        // Since I used -= in my implementation we need -1 here.""
        setShift(-1.0, -130.0);
    } // Constructor

    public String getName () {
        return "F8F2 -> Shifted";
    } // getName

    public String getShortName () { return "F26S"; } // getShortName

} // F26S
