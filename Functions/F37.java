package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 61.
 */
public class F37 extends F36 {
    
    public F37 (Random r, int n) {
        super(r, n);
        isBounded = false;
        min = 2;
        max = 5;
    } // Constructor

    public String getShortName () { return "F37"; } // getShortName

} // F37
