package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 44.
 */
public class F22S extends F22 {
    
    public F22S (Random r, int n) {
        super(r, n);
        setShift(10.0, -450.0);
    } // Constructor

    public String getName () {
        return "Spherical -> Shifted";
    } // getName

    public String getShortName () { return "F22S"; } // getShortName

} // F22S
