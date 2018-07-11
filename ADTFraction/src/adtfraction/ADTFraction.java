/*
 * Author: Rodi Murad
 * Class: CIT130
 * Assignment: Week 8 part 1
 * Title: DenominatorIsNotZero
 * Date: 07/11/2015
 */

package adtfraction;

import java.io.*;
import java.util.Scanner;

public class ADTFraction {

    public static void main(String[] args) {
        
        //declare the variables used for fractions equality verification 
        //and user input
        int targetNumerator;
        int targetDenominator;
        int nextNumerator;
        int nextDenominator;
        boolean i=false;
        String input;
        String Y="y"; // lower level y value given to string Y.
        
        
        //scanner keyboard is used to take users input and use it in the program
        Scanner keyboard = new Scanner(System.in);
        
        do{
            
        //used to display message to enter the target numerator and denominator values
        System.out.print("Please enter the numerator for target fraction: ");
        targetNumerator = keyboard.nextInt();
        System.out.print("Please enter the denominator for target fraction: ");
        targetDenominator = keyboard.nextInt();
        
        //takes the input for the fractions values that will be compared to the original input
        System.out.print("Please enter the numerator for next fraction: ");
        nextNumerator = keyboard.nextInt(); 
        System.out.print("Please enter the denominator for next fraction: ");
        nextDenominator = keyboard.nextInt();
        
        try
        {
        //sets the values entered to the fraction class
        Fraction f1 = new Fraction(targetNumerator, targetDenominator);
        //sets the values entered to the fraction class
        Fraction f2 = new Fraction(nextNumerator, nextDenominator);       
        
        // checks if first fraction equals the second fraction(cross multiplication)
        if (f1.equals(f2))
            System.out.println("the fraction you just entered equals the first fraction of " + f1.toString());
        else
            System.out.println("The fraction you just entered not equal the first fraction of " + f1.toString());
        
        
        //the do while uses the loop to execute at least once but will continue
        //as long as the input equals yes. or terminate if anything else is entered
        do
        {
            //removes the newline character that remains in the keyboard buffer.
            keyboard.nextLine();
        
            System.out.print("Would you like to continue (Y/N)? ");
            input = keyboard.nextLine(); 
            
            //condition to check if the input is equal, if yes the program is run if not then exit
            if (input.equals(Y))
            {
            System.out.print("Please enter the numerator for next fraction: ");
            nextNumerator = keyboard.nextInt(); 
            System.out.print("Please enter the denominator for next fraction: ");
            nextDenominator = keyboard.nextInt();
            }
            else
            {
                System.exit(0);
            }
            
            Fraction f3 = new Fraction(nextNumerator, nextDenominator);
        
            if (f1.equals(f3))
                System.out.println("the fraction you just entered equals the first fraction of " + f1.toString());
            else
                System.out.println("The fraction you just entered not equal the first fraction of " + f1.toString());
            
            //condition used in the while which determines the amount of time the program is be run
            //but atleast once it will execute.
        } while(input.equals(Y));
        }
        
        catch(DenominatorIsZeroException e)
        {
            System.out.println(e);
        }
        //this while is for the try/catch so the input can be restarted
        }while(i = true);
    }
}
