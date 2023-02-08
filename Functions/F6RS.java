package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 15.
 * 
 * F6 function shifted.
 */
public class F6RS extends F6 {
    
    public F6RS (Random r, int n) {
        super(r, n);
        // Change the bounds of the search space for this function.
        min = 0;
        max = 600;
        setRotation("linear", 3);
        setShift(-60.0, -180.0);
    } // Constructor

    public String getName () {
        return "Griewank -> Rotated & Shifted";
    } // getName

    public String getShortName () { return "F6RS"; } // getShortName

} // F6RS
