package thesis.Benchmarks;

import java.util.Random;
import thesis.Helper; // For helper functions (dot product)

/**
 * Schwefel 2.6 function.
 */
public class Schwefel26 extends Function {

    int [][] A;
    double [] B;

    public Schwefel26 (Random r, int n) {

        super(r, n, -100, 100);

        // Initialize A
        A = new int [n][];
        for (int i = 0; i < A.length; i++)
            A[i] = new int [n];

        // Initialize B
        B = new double [n];

        // Calculate A & b
        calcA();
        calcB();

    } // Constructor

    @Override
    public double compute (double [] x) {
        double max = Math.abs(Helper.dot(A[0], x) - B[0]);
        for(int i = 1; i < x.length; i++) {
            double tmp = Math.abs(Helper.dot(A[i], x) - B[i]);
            max = (max > tmp) ? max : tmp;
        }
        return max;
    } // compute

    @Override
    public String getName () {
        return "Schwefel 2.6";
    } // getName

    /**
     * Calculates matrix A for evaluation.
     * 
     * Cody & Kyle's implementations don't check the determinant, 
     * so if it takes awhile it can probably be removed since it's 
     * highly unlikely it will be.
     */
    private void calcA () {
        while (true) {
            for(int i = 0; i < n; i++)
                for(int j = 0; j < n; j++)
                    A[i][j] = (int)((r.nextDouble() * 1000) - 500);
            break; // TODO: verify that det(A) != 0
        }
        // Determinant check was causing infinite loop.
        // Need to look into why this is the case.
        // do {
        //     for(int i = 0; i < n; i++)
        //         for(int j = 0; j < n; j++)
        //             A[i][j] = (int)((r.nextDouble() * 1000) - 500);
        // } while(Helper.det(A, n) == 0); // Want det(A) != 0
    } // calcA

    /**
     * Calculates vector B for evaluation.
     */
    private void calcB () {
        for(int i = 0; i < n; i++){
            double [] tmp = new double [n];
            for(int j = 0; j < n; j++)
                tmp[j] = ((r.nextDouble() * 200) - 100);
            B[i] = Helper.dot(A[i], tmp);
        }
    } // calcB

} // Schwefel26
