package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 4.
 * 
 * Function 2 rotated.
 */
public class F2R extends F2 {
    
    public F2R (Random r, int n) {
        super(r, n);
        setRotation("ortho", 0);
    } // Constructor

    public String getName () {
        return "Ackley -> Rotated";
    } // getName

    public String getShortName () { return "F2R"; } // getShortName

} // F2R
