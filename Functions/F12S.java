package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 23.
 */
public class F12S extends F12 {
    
    public F12S (Random r, int n) {
        super(r, n);
        setShift(2.0, -330.0);
    } // F12S

    public String getName () {
        return "Rastrigin -> Shifted";
    } // getName

    public String getShortName () { return "F12S"; } // getShortName

} // F12S
