package thesis.Benchmarks.Functions;

import java.util.Random;
import thesis.Benchmarks.Schwefel213;

/**
 * Function 38.
 */
public class F18 extends Schwefel213 {
    
    public F18 (Random r, int n) {
        super(r, n);
    } // Constructor

    public String getShortName () { return "F18"; } // getShortName

} // F18
