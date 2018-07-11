/*
 * Assignment 4
 * Sentinel value performance
 * CSCI 717
 * 11/5/2017
 * Rodi Murad
 */

package sentinelvalueforperformanceb;

public class SentinelValueForPerformanceB {

    public static void main(String[] args) {
         
        int tValue = 75;
        testValueB testV = new testValueB(tValue);
        System.out.println(testV.find(tValue));

    }
    
}
