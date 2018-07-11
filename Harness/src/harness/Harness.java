package harness;

/**
 * @(#)Harness.java
 *
 *
 * @author Kenneth L Moore
 * @version 1.00 2008/9/18
 */

/*
 * This program demonstrates harnessing another class and testing it out.
 *
 * In this case, the harnessed class is Farkleberry
 *
 */

import java.util.Scanner;

public class Harness {

   
    public static void main(String[] args) {
    	
    	// instantiate the test berry trees
    	Farkleberry fb1 = new Farkleberry(), fb2 = new Farkleberry();    	
    		
    	// show things about the initial trees	
    	System.out.println( "fb1 =  " + fb1);
    	System.out.println( "fb2 =  " + fb2);
    	System.out.println( "fb1 == fb2 is " + fb1.equals(fb2));
    	
    	// mutate a tree
    	fb1.add17();
    	
    	// now show the current state
    	System.out.println( "fb1 =  " + fb1);
    	System.out.println( "fb1 == fb2 is " + fb1.equals(fb2));
    }
}

