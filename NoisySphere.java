package thesis.Benchmarks;

import java.util.Random;

import thesis.Helper;

/**
 * A noisy sphere function.
 */
public class NoisySphere extends Spherical {

    Function sphere;
    
    public NoisySphere (Random r, int n) {

        super(r, n);

        sphere = new Spherical(r, n);

    } // Constructor

    @Override
    public double compute (double [] x) {
        return sphere.compute(x) * (1 + (0.1 * Helper.normalRandom(r, 0, 1)));
    } // compute

} // NoisySphere
