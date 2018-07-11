/*
 * Assignment 4
 * Sentinel value performance
 * CSCI 717
 * 11/5/2017
 * Rodi Murad
 */
package sentinelvalueforperformance;

public class SentinelValueForPerformance {

    public static void main(String[] args) {
        
        int tValue = 75;
        testValue testV = new testValue(tValue);
        System.out.println(testV.find(tValue));

    }
    
}
