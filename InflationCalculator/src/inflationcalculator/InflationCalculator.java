 /*
 * Inflation Calculator
 * Author: Rodi Murad
 * Class: CIT 130
 * Date: 05/24/2015
 */

package inflationcalculator;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class InflationCalculator {
    
    public static void main(String[] args) {
        
        String input; //this string is used for the input from the inputdialog
        Double rate;  //inflation rate as a double
        Double term;  //term as a double
        Double current_Cost; //current cost of the item as a double
        
        //the program indicated that the variable was not declared until placed null, why?
        //specifically lines 48 and 59 if null is commented out, then i get an error
        Double fnl_Cost = null; 
        
        input = JOptionPane.showInputDialog("Please enter the current cost of the item");
        current_Cost = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Please enter the inflation rate per "+
                "year in percent, exclude the percent sign");
        rate = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Please enter the number of years in "+
                "the future to project cost");
        term = Double.parseDouble(input);
        
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
        
        System.out.println("Current Cost $" + formatter.format (current_Cost));
        System.out.println("rate " + rate + "%");
        System.out.println("term " + term + " years");
        System.out.println("Final Cost after " + term + " years, $" +formatter.format(fnl_Cost));
                
        //Another method to make such calculation without using the loop
        
        Double fnl_Cost2;
        
        fnl_Cost2 = current_Cost * Math.pow((1 + rate/100),term);
        
        System.out.println("Final Cost after " + term + " years, $" + formatter.format(fnl_Cost2));
        System.exit(0);
    }  
}
