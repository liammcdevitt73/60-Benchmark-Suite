package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 13.
 * 
 * F6 function rotated.
 */
public class F6R extends F6 {
    
    public F6R (Random r, int n) {
        super(r, n);
        setRotation("ortho", 0);
    } // Constructor

    public String getName () {
        return "Griewank -> Rotated";
    } // getName

    public String getShortName () { return "F6R"; } // getShortName

} // F6R
