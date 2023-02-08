package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 31.
 */
public class F15RS extends F15 {
    
    public F15RS (Random r, int n) {
        super(r, n);
        setShift(20.0, -300.0);
        setRotation("linear", 3);
    } // Constructor

    public String getName () {
        return "Schaffer 6 -> Rotated & Shifted";
    } // getName

    public String getShortName () { return "F15RS"; } // getShortName

} // F15RS
