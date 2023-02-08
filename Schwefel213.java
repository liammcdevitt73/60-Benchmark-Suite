package thesis.Benchmarks;

import java.util.Random;

/**
 * Schwefel 2.13 function.
 */
public class Schwefel213 extends Function {
    
    double [][] A;
    double [][] B;

    double []   APiVec;

    public Schwefel213 (Random r, int n) {

        super(r, n, -Math.PI, Math.PI);

        // Initialize globals
        A = new double [n][];
        for (int i = 0; i < A.length; i++)
            A[i] = new double [n];

        B = new double [n][];
        for (int i = 0; i < B.length; i++)
            B[i] = new double [n];

        APiVec = new double [n];

        // Calculate A, B, & APiVec
        double [] PIs = new double [n];
        for(int i = 0; i < n; i++)
            PIs[i] = (r.nextDouble() * 2 * Math.PI) - Math.PI;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                A[i][j] = (r.nextDouble() * 200) - 100;
                B[i][j] = (r.nextDouble() * 200) - 100;
            }
            APiVec[i] = Bj(PIs, i);
        }

    } // Constructor

    @Override
    public double compute (double [] x) {
        double sum = 0;
        for(int i = 0; i < x.length; i++)
            sum += Math.pow(APiVec[i] - Bj(x, i), 2);
        return sum;
    } // compute

    @Override
    public String getName () {
        return "Schwefel 2.13";
    } // getName

    private double Bj(double [] x, int row) {
        double sum = 0;
        for(int i = 0; i < n; i++)
            sum += A[row][i] * Math.sin(x[i]) + B[row][i] * Math.cos(x[i]);
        return sum;
    } // Bj

} // Schwefel213
