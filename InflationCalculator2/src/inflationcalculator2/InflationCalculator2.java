/*
 * Inflation Calculator 2
 * Author: Rodi Murad
 * Class: CIT 130
 * Date: 05/25/2015
 */
package inflationcalculator2;
import java.util.Scanner;
import java.text.DecimalFormat;


public class InflationCalculator2 {

    public static void main(String[] args) {
     
        //String input;        //this string is used for the input from the inputdialog
        double rate;         //inflation rate as a double
        double term;         //term as a double
        double current_Cost; //current cost of the item as a double
        double fnl_Cost = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Please enter the current cost of the item $");
        current_Cost = keyboard.nextDouble();
        
        System.out.print("Please enter the annual inflation rate in percent ");
        rate = keyboard.nextDouble();
        
        System.out.print("Please enter the anticipated term in years ");
        term = keyboard.nextDouble();
        
        int i;
        for ( i = 1; i <= term; i++)
        {
            /* condition needed to to ensure that we only use the current
            cost the first time, then build up inflation onto the final cost for
            each iteration
            */
            if (i == 1)
            {
                fnl_Cost = current_Cost * (1 + rate/100);
            }
            else
            {
                fnl_Cost *= (1 + rate/100);
            }
        }
        
        /*create a DecimalFormat object to limit the number of decimal places 
        in the final number*/
        DecimalFormat formatter = new DecimalFormat("#,##0.00");
        
        System.out.println("***********************************************");
        System.out.println("Current Cost $" + formatter.format (current_Cost));
        System.out.println("rate " + rate + "%");
        System.out.println("term " + term + " years");
        System.out.println("Final Cost after " + term + " years, $" +formatter.format(fnl_Cost));
        
    }
    
}
