package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 14.
 * 
 * F6 function shifted.
 */
public class F6S extends F6 {
    
    public F6S (Random r, int n) {
        super(r, n);
        setShift(10.0, -180.0);
    } // Constructor

    public String getName () {
        return "Griewank -> Shifted";
    } // getName

    public String getShortName () { return "F6S"; } // getShortName

} // F6S
