package thesis.Benchmarks.Functions;

import thesis.Benchmarks.Schwefel12;
import java.util.Random;

/**
 * Function 32.
 */
public class F16 extends Schwefel12 {
    
    public F16 (Random r, int n) {
        super(r, n);
    } // Constructor

    public String getShortName () { return "F16"; } // getShortName

} // F16
