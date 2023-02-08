package thesis.Benchmarks.Functions;

import java.util.Random;

/**
 * Function 55.
 */
public class F31 extends F30 {
    
    public F31 (Random r, int n) {
        super(r, n);
        initSigmas();
        initLambdas();
    } // F31

    private void initSigmas () {
        sigmas[0] = 0.1;
        sigmas[1] = 2;
        sigmas[2] = 1.5;
        sigmas[3] = 1.5;
        sigmas[4] = 1;
        sigmas[5] = 1;
        sigmas[6] = 1.5;
        sigmas[7] = 1.5;
        sigmas[8] = 2;
        sigmas[9] = 2;
    } // initSigmas

    private void initLambdas () {
        lambdas[0] = 0.1 * 5.0 / 32.0;
        lambdas[1] = 5.0 / 32.0;
        lambdas[2] = 2.0;
        lambdas[3] = 1.0;
        lambdas[4] = 2.0 * 5.0 / 100.0;
        lambdas[5] = 0.05;
        lambdas[6] = 20.0;
        lambdas[7] = 10.0;
        lambdas[8] = 2.0 * 5.0 / 60.0;
        lambdas[9] = 5.0 / 60.0;
    } // initLambdas

    public String getShortName () { return "F31"; } // getShortName

} // F31
