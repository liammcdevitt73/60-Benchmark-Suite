package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 33.
 */
public class F16S extends F16 {
    
    public F16S (Random r, int n) {
        super(r, n);
        setShift(10.0, -450.0);
    } // Constructor

    public String getName () {
        return "Schwefel 1.2 -> Shifted";
    } // getName

    public String getShortName () { return "F16S"; } // getShortName

} // F16S
