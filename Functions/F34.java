package thesis.Benchmarks.Functions;

import java.util.Random;

import thesis.Benchmarks.CompositionFunctionWithDefaults;
import thesis.Benchmarks.*;

/**
 * Function 58.
 * 
 * Identical to F33, except for rotation matrices.
 */
public class F34 extends CompositionFunctionWithDefaults {

    public F34 (Random r, int n) {
        super(r, n);

        initFs();
        initSigmas();
        initLambdas();
        initMainBias();

        Fs[0].setRotation("linear", 10);
        Fs[1].setRotation("linear", 20);
        Fs[2].setRotation("linear", 50);
        Fs[3].setRotation("linear", 100);
        Fs[4].setRotation("linear", 200);
        Fs[5].setRotation("linear", 1000);
        Fs[6].setRotation("linear", 2000);
        Fs[7].setRotation("linear", 3000);
        Fs[8].setRotation("linear", 4000);
        Fs[9].setRotation("linear", 5000);

    } // Constructor

    private void initFs () {
        Fs[0] = new Schaffer6(r, n);
        Fs[1] = new Schaffer6(r, n);
        Fs[2] = new Rastrigin(r, n);
        Fs[3] = new Rastrigin(r, n);
        Fs[4] = new F8F2(r, n);
        Fs[5] = new F8F2(r, n);
        Fs[6] = new Weierstrass(r, n);
        Fs[7] = new Weierstrass(r, n);
        Fs[8] = new Griewank(r, n);
        Fs[9] = new Griewank(r, n);
    } // initFs

    private void initSigmas () {
        sigmas[0] = 1.0;
        sigmas[1] = 1.0;
        sigmas[2] = 1.0;
        sigmas[3] = 1.0;
        sigmas[4] = 1.0;
        sigmas[5] = 2.0;
        sigmas[6] = 2.0;
        sigmas[7] = 2.0;
        sigmas[8] = 2.0;
        sigmas[9] = 2.0;
    } // initSigma

    private void initLambdas () {
        lambdas[0] = 1.0 / 4.0;
        lambdas[1] = 0.05;
        lambdas[2] = 5.0;
        lambdas[3] = 1.0;
        lambdas[4] = 5.0;
        lambdas[5] = 1.0;
        lambdas[6] = 50.0;
        lambdas[7] = 10.0;
        lambdas[8] = 25.0 / 200.0;
        lambdas[9] = 5.0 / 200.0;
    } // initLambdas

    private void initMainBias () {
        mainBias = 360;
    } // initMainBias

    public String getShortName () { return "F34"; } // getShortName

} // F34

