package thesis.Benchmarks;

import java.util.Random;

/**
 * Extends a composition function with default values.
 */
public class CompositionFunctionWithDefaults extends CompositionFunction {

    public CompositionFunctionWithDefaults (Random r, int n) {

        super(r, n);

        C = 2000;

        for (int i = 0; i < numFs; i++) {
            bias[i] = i * 100;
            shifts[i] = 0;
        }

        y = new double [n];
        for (int i = 0; i < n; i++)
            y[i] = 5; // Defined in CEC2005
        
        // Each function gets a uniform random shift
        for (int i = 0; i < numFs; i++)
            shifts[i] = (r.nextDouble() * (max - min)) + min;

    } // Constructor
    
} // CompositionFunctionWithDefaults
