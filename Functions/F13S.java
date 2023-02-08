package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 27.
 */
public class F13S extends F13 {
    
    public F13S (Random r, int n) {
        super(r, n);
        min = -100;
        max = 100;
        setShift(10.0, 390.0);
    } // F13S

    public String getName () {
        return "Rosenbrock -> Shifted";
    } // getName

    public String getShortName () { return "F13S"; } // getShortName

} // F13S
