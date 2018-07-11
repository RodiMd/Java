/*
 * Assignment5
 * CSCI 717
 * 12/4/2017
 * Rodi Murad
 */
package discountapp;
import java.util.*;

public class DiscountApp{

    public static void main(String[] args) throws Exception {
        
        String title = "";
        double price = 0.0;
        double quantity = 0.0;
        boolean testVal=true;
        Scanner keyboard = new Scanner(System.in);
        do{
            try{

                System.out.println("enter title");
                title = keyboard.next();

                System.out.println("enter price");
                price = keyboard.nextDouble();

                System.out.println("enter quantity");
                quantity = keyboard.nextDouble();
                //precondition, price >= 0 and isNumeric, quantity >= 0 and isNumeric
                //postcondition, discountedSubtotal >= 0
                if(price < 0 || quantity < 0){
                    System.out.println("values cannot be negative");
                }else{
                    Item item = new Item(title, price, quantity);
                    sale discountedSubtotal = new sale();
                    discountedSubtotal.addItem(item);

                    System.out.println("The total is " + discountedSubtotal.getDiscountedSubTotal());
                }
                
            }
            catch(InputMismatchException e){
                System.out.println("the cost and quantity values must be numeric");
                testVal = true;
            }
            keyboard.nextLine();
            boolean testYesNO = true;
            do{
                //precondition, continueInput = y or no
                //postcondition, if y then continue, if n then terminate
                System.out.println("Do you want to add items? yes = y, no = n");
                String continueInput;
                continueInput = keyboard.nextLine();
                
                switch (continueInput) {
                case "Y":
                case "y":
                    testYesNO = true;
                    testVal = true;
                    break;
                case "N":
                case "n":
                    testYesNO = true;
                    testVal = false;
                    break;
                default:
                    System.out.println("The user must enter y for yes or n for no");
                    testYesNO = false;
                    testVal = false;
                    break;
                }
                
            }while(testYesNO == false);
            
        }while(testVal == true);
    }
}
