package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 3.
 * 
 * Function 2 shifted.
 */
public class F2S extends F2 {
    
    public F2S (Random r, int n) {
        super(r, n);
        setShift(10.0, -140.0);
    } // Constructor

    public String getName () {
        return "Ackley -> Shifted";
    } // getName

    public String getShortName () { return "F2S"; } // getShortName

} // F2S
