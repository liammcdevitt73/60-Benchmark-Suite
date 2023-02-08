package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 52.
 */
public class F28 extends F27 {

    public F28 (Random r, int n) {
        super(r, n);
        for (int i = 0; i < numFs; i++)
            Fs[i].setRotation("linear", 2);
    } // Constructor

    public String getShortName () { return "F28"; } // getShortName

} // F28
