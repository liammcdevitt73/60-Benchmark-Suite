package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 11.
 * 
 * F5 function rotated & shifted.
 */
public class F5RS extends F5 {
    
    public F5RS (Random r, int n) {
        super(r, n);
        setRotation("ortho", 0);
        setShift(10.0, -450.0);
    } // Constructor

    public String getName () {
        return "Elliptic -> Rotated & Shifted";
    } // getName

    public String getShortName () { return "F5RS"; } // getShortName

} // F5RS
