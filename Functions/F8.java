package thesis.Benchmarks.Functions;

import thesis.Benchmarks.Michalewicz;
import java.util.Random;

/**
 * Function 17.
 */
public class F8 extends Michalewicz {
    
    public F8 (Random r, int n) {
        super(r, n);
    } // Constructor

    public String getShortName () { return "F8"; } // getShortName

} // F8
