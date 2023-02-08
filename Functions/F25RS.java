package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 48.
 */
public class F25RS extends F25 {
    
    public F25RS (Random r, int n) {
        super(r, n);
        setRotation("linear", 5);
        setShift(0.1, 90.0);
    } // Constructor

    public String getName () {
        return "Weierstrass -> Rotated & Shifted";
    } // getName

    public String getShortName () { return "F25RS"; } // getShortName

} // F25RS
