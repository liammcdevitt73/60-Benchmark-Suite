package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 37.
 */
public class F17S extends F17 {
    
    public F17S (Random r, int n) {
        super(r, n);
        setShift(0.0, -310.0);
    } // Constructor

    public String getName () {
        return "Schwefel 2.6 -> Shifted";
    } // getName

    public String getShortName () { return "F17S"; } // getShortName

} // F17S
