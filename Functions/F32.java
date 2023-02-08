package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 56.
 */
public class F32 extends F30 {
    
    public F32 (Random r, int n) {
        super(r, n);

        double [] tmp = new double [n];
        for (int i = 0; i < n; i++)
            if (i % 2 == 0)
                tmp[i] = 5;
            else
                tmp[i] = shifts[0];
        shifts[0] = 0;
        Fs[0].setShift(tmp, 0);

    } // Constructor

    public String getShortName () { return "F32"; } // getShortName

} // F32
