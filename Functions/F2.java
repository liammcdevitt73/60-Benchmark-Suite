package thesis.Benchmarks.Functions;

import thesis.Benchmarks.Ackley;
import java.util.Random;

/**
 * Function 2.
 */
public class F2 extends Ackley {
    
    public F2 (Random r, int n) {
        super(r, n);
    } // Constructor

    public String getShortName () { return "F2"; } // getShortName

} // F2
