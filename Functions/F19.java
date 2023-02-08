package thesis.Benchmarks.Functions;

import java.util.Random;
import thesis.Benchmarks.Schwefel221;

/**
 * Function 40.
 */
public class F19 extends Schwefel221 {
    
    public F19 (Random r, int n) {
        super(r, n);
    } // Constructor

    public String getShortName () { return "F19"; } // getShortName

} // F19
