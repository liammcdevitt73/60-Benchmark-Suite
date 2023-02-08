package thesis.Benchmarks.Functions;

import java.util.Random;
import thesis.Benchmarks.Griewank;

/**
 * Function 12.
 * 
 * F6 function.
 */
public class F6 extends Griewank {
    
    public F6 (Random r, int n) {
        super(r, n);
    } // Constructor

    public String getShortName () { return "F6"; } // getShortName

} // F6
