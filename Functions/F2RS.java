package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 5.
 * 
 * Function 2 rotated & shifted.
 */
public class F2RS extends F2 {
    
    public F2RS (Random r, int n) {
        super(r, n);
        setRotation("linear", 100);
        setShift(-32.0, -140.0);
    } // Constructor

    public String getName () {
        return "Ackley -> Rotated & Shifted";
    } // getName

    public String getShortName () { return "F2RS"; } // getShortName

} // FSRS
