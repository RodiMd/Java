/*
 * Assignment 4
 * loop Unrolling
 * CSCI 717
 * 11/5/2017
 * Rodi Murad
 */
package loopunrollingforperformance;

public class LoopUnrollingForPerformance {

    public static void main(String[] args) {
        
        int x = 600;
        System.out.println(ComputeSum(x));
    }   

    public static double ComputeSum(int numIterations) { 

        int i; 
        double k = 0;
        double sum = 0.0; 
        for (i = 0; i < numIterations; i++){ 
            sum += 1.0;
            k += 1;
        } 
        System.out.println("k is " + k);
        return sum; 
    }
}