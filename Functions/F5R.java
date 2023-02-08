package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 10.
 * 
 * F5 function rotated.
 */
public class F5R extends F5 {
    
    public F5R (Random r, int n) {
        super(r, n);
        setRotation("ortho", 0);
    } // Constructor

    public String getName () {
        return "Elliptic -> Rotated";
    } // getName

    public String getShortName () { return "F5R"; } // getShortName

} // F5R
