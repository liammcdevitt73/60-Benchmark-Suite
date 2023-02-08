package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 28.
 */
public class F13R extends F13 {
    
    public F13R (Random r, int n) {
        super(r, n);
        min = -100;
        max = 100;
        setRotation("ortho", 0);
    } // F13R

    public String getName () {
        return "Rosenbrock -> Rotated";
    } // getName

    public String getShortName () { return "F13R"; } // getShortName

} // F13R
