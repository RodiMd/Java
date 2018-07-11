/*
 * Assingmnet 4
 * Loop Unrolling
 * CSCI 717
 * 11/5/2017
 * Rodi Murad
 */
package loopunrollingforperformanceb;

public class LoopUnrollingForPerformanceB {

    public static void main(String[] args) {
        
        int x = 600;
        System.out.println(ComputeSum(x));
                
    }
    public static double ComputeSum (int numIterations) { 
        double sum0, sum1, sum2, sum3, sum4, sum5, sum6, sum7; 
        int i; 
        double sum = 0.0;
        
        sum0 = sum1 = sum2 = sum3 = sum4 = sum5 = sum6 = sum7 = 0.0;
        double k = 0;//not original, remove
        for (i = 0; (i+7) < numIterations; i += 8) { 
            sum0 += 1.0; 
            sum1 += 1.0; 
            sum2 += 1.0; 
            sum3 += 1.0; 
            sum4 += 1.0; 
            sum5 += 1.0; 
            sum6 += 1.0; 
            sum7 += 1.0;
            k += 1;
        } 
        
        System.out.println("K is " + k);
        //System.out.println("sum1 is "+sum);
        sum = sum0 + sum1 + sum2 + sum3 +sum4 +sum5 + sum6 + sum7;
        //System.out.println("sum is "+sum);
        for (;i<numIterations; i++) {
            sum += 1.0;
            //k += 1;
            //System.out.println("k "+k+" & sum "+sum);
        } 
        return sum; 
    }
}
