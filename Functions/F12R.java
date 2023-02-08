package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 24.
 */
public class F12R extends F12 {
    
    public F12R (Random r, int n) {
        super(r, n);
        setRotation("ortho", 0);
    } // F12R

    public String getName () {
        return "Rastrigin -> Rotated";
    } // getName

    public String getShortName () { return "F12R"; } // getShortName

} // F12R
