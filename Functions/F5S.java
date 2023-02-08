package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 9.
 * 
 * F5 function shifted.
 */
public class F5S extends F5 {
    
    public F5S (Random r, int n) {
        super(r, n);
        setShift(10.0, -450.0);
    } // Constructor

    public String getName () {
        return "Elliptic -> Shifted";
    } // getName

    public String getShortName () { return "F5S"; } // getShortName

} // F5S
