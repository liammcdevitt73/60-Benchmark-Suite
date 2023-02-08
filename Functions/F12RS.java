package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 25.
 */
public class F12RS extends F12 {
    
    public F12RS (Random r, int n) {
        super(r, n);
        setShift(1.0, -330.0);
        setRotation("linear", 2);
    } // F12RS

    public String getName () {
        return "Rastrigin -> Rotated & Shifted";
    } // getName

    public String getShortName () { return "F12RS"; } // getShortName

} // F12RS
