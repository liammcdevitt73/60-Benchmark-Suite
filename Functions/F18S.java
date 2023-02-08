package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 39.
 */
public class F18S extends F18 {
    
    public F18S (Random r, int n) {
        super(r, n);
        setShift(0.0, -460.0);
    } // Constructor

    public String getName () {
        return "Schwefel 2.13 -> Shifted";
    } // getName

    public String getShortName () { return "F18S"; } // getShortName

} // F18S
