package thesis.Benchmarks.Functions;

import java.util.Random;
import thesis.Benchmarks.CompositionFunctionWithDefaults;
import thesis.Benchmarks.*;

/**
 * Function 54.
 */
public class F30 extends CompositionFunctionWithDefaults{
    
    public F30 (Random r, int n) {

        super(r, n);
        initFs();
        initSigmas();
        initLambdas();
        initMainBias();

        Fs[0].setRotation("linear", 2);
        Fs[1].setRotation("linear", 3);
        Fs[2].setRotation("linear", 2);
        Fs[3].setRotation("linear", 3);
        Fs[4].setRotation("linear", 2);
        Fs[5].setRotation("linear", 3);
        Fs[6].setRotation("linear", 20);
        Fs[7].setRotation("linear", 30);
        Fs[8].setRotation("linear", 200);
        Fs[9].setRotation("linear", 300);

        // Cody - TODO: just keep in mind the tenth functions should not be shifted
        shifts[9] = 0;

    } // Constructor

    private void initFs () {
        Fs[0] = new Ackley(r, n);
        Fs[1] = new Ackley(r, n);
        Fs[2] = new Rastrigin(r, n);
        Fs[3] = new Rastrigin(r, n);
        Fs[4] = new Spherical(r, n);
        Fs[5] = new Spherical(r, n);
        Fs[6] = new Weierstrass(r, n);
        Fs[7] = new Weierstrass(r, n);
        Fs[8] = new Griewank(r, n);
        Fs[9] = new Griewank(r, n);
    } // initFs

    private void initSigmas () {
        sigmas[0] = 1;
        sigmas[1] = 2;
        sigmas[2] = 1.5;
        sigmas[3] = 1.5;
        sigmas[4] = 1;
        sigmas[5] = 1;
        sigmas[6] = 1.5;
        sigmas[7] = 1.5;
        sigmas[8] = 2;
        sigmas[9] = 2;
    } // initSigma

    private void initLambdas () {
        lambdas[0] = 2.0 * 5.0 / 32.0;
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

    private void initMainBias () {
        mainBias = 10;
    } // initMainBias

    public String getShortName () { return "F30"; } // getShortName

} // F30
