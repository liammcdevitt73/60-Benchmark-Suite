package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 34.
 */
public class F16R extends F16 {
    
    public F16R (Random r, int n) {
        super(r, n);
        setRotation("ortho", 0);
    } // Constructor

    public String getName () {
        return "Schwefel 1.2 -> Rotated";
    } // getName

    public String getShortName () { return "F16R"; } // getShortName

} // F16R
