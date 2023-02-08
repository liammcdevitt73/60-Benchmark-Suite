package thesis.Benchmarks.Functions;

import thesis.Benchmarks.CompositionFunctionWithDefaults;
import java.util.Random;
import thesis.Benchmarks.*;

/**
 * Function 60.
 */
public class F36 extends CompositionFunctionWithDefaults {
    
    public F36 (Random r, int n) {
        super(r, n);

        initFs();
        initSigmas();
        initLambdas();
        initMainBias();

        Fs[0].setRotation("linear", 100);
        Fs[1].setRotation("linear", 50);
        Fs[2].setRotation("linear", 30);
        Fs[3].setRotation("linear", 10);
        Fs[4].setRotation("linear", 5);
        Fs[5].setRotation("linear", 5);
        Fs[6].setRotation("linear", 4);
        Fs[7].setRotation("linear", 3);
        Fs[8].setRotation("linear", 2);
        Fs[9].setRotation("linear", 2);

    } // Constructor

    private void initFs () {
        Fs[0] = new Weierstrass(r, n);
        Fs[1] = new Schaffer6(r, n);
        Fs[2] = new F8F2(r, n);
        Fs[3] = new Ackley(r, n);
        Fs[4] = new Rastrigin(r, n);
        Fs[5] = new Griewank(r, n);
        Fs[6] = new Schaffer6(r, n);
        Fs[6].setDiscrete();
        Fs[7] = new Rastrigin(r, n);
        Fs[7].setDiscrete();
        Fs[8] = new Elliptic(r, n);
        Fs[9] = new NoisySphere(r, n);
    } // initFs

    private void initSigmas () {
        for (int i = 0; i < numFs; i++)
            sigmas[i] = 2;
    } // initSigma

    private void initLambdas () {
        lambdas[0] = 10.0;
        lambdas[1] = 5.0 / 20.0;
        lambdas[2] = 1.0;
        lambdas[3] = 5.0 / 32.0;
        lambdas[4] = 1.0;
        lambdas[5] = 0.05;
        lambdas[6] = 0.1;
        lambdas[7] = 1.0;
        lambdas[8] = 5.0 / 100.0;
        lambdas[9] = 5.0 / 100.0;
    } // initLambdas

    private void initMainBias () {
        mainBias = 260;
    } // initMainBias

    public String getShortName () { return "F36"; } // getShortName

} // F36
