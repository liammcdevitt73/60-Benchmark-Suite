package thesis.Benchmarks.Functions;

import java.util.Random;
import thesis.Benchmarks.*;

/**
 * Function 51.
 */
public class F27 extends CompositionFunctionWithDefaults {
    
    public F27 (Random r, int n) {
        super(r, n);
        initFs();
        initSigmas();
        initLambdas();
        initMainBias();
    } // Constructor

    private void initFs () {
        Fs[0] = new Rastrigin(r, n);
        Fs[1] = new Rastrigin(r, n);
        Fs[2] = new Weierstrass(r, n);
        Fs[3] = new Weierstrass(r, n);
        Fs[4] = new Griewank(r, n);
        Fs[5] = new Griewank(r, n);
        Fs[6] = new Ackley(r, n);
        Fs[7] = new Ackley(r, n);
        Fs[8] = new Spherical(r, n);
        Fs[9] = new Spherical(r, n);
    } // initFs

    private void initSigmas () {
        for (int i = 0; i < numFs; i++)
            sigmas[i] = 1;
    } // initSigma

    private void initLambdas () {
        lambdas[0] = 1;
        lambdas[1] = 1;
        lambdas[2] = 10;
        lambdas[3] = 10;
        lambdas[4] = 5.0 / 60.0;
        lambdas[5] = 5.0 / 60.0;
        lambdas[6] = 5.0 / 32.0;
        lambdas[7] = 5.0 / 32.0;
        lambdas[8] = 5.0 / 100.0;
        lambdas[9] = 5.0 / 100.0;
    } // initLambdas

    private void initMainBias () {
        mainBias = 120;
    } // initMainBias

    public String getShortName () { return "F27"; } // getShortName

} // F27
