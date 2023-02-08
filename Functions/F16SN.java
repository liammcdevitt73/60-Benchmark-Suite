package thesis.Benchmarks.Functions;

import java.util.Random;

import thesis.Helper;
import thesis.Benchmarks.Schwefel12;
import thesis.Benchmarks.Function;

/**
 * Function 35.
 */
public class F16SN extends F16 {

    Function schwefel12;
    
    public F16SN (Random r, int n) {
        super(r, n);
        schwefel12 = new Schwefel12(r, n);
        isNoisyFunction = true;
        setShift(10.0, -450.0);
    } // Constructor

    // Cody - "Modify eval to add noise in the desired way"
    @Override
    public double compute (double [] x) {
        return schwefel12.compute(x) * (1 + 0.4 * Math.abs(Helper.normalRandom(r, 0, 1)));
    } // compute

    public String getName () {
        return "Schwefel 1.2 -> Shifted & Noisy";
    } // getName

    public String getShortName () { return "F16SN"; } // getShortName

} // F16SN
