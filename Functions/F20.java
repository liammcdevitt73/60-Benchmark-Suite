package thesis.Benchmarks.Functions;

import java.util.Random;
import thesis.Benchmarks.Schwefel222;

/**
 * Function 41.
 */
public class F20 extends Schwefel222 {
    
    public F20 (Random r, int n) {
        super(r, n);
    } // Constructor

    public String getShortName () { return "F20"; } // getShortName

} // F20
