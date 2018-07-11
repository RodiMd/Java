/*
 * Assignment5
 * CSCI 717
 * 12/4/2017
 * Rodi Murad
 */
package discountappbogo;
import java.util.*;

public class DiscountAppBOGO {

    public static void main(String[] args) throws Exception{
        Scanner keyboard = new Scanner(System.in);
        
        String title = "";
        double price = 0.0;
        double quantity = 0.0;
        boolean testVal=true;
        
        do{
            try{
                System.out.println("enter title");
                title = keyboard.next();
                
                System.out.println("enter price");
                price = keyboard.nextDouble();
                if(price < 0 ){
                    System.out.println("price cannot be negative");
                    continue;
                }
                System.out.println("enter quantity");
                quantity = keyboard.nextDouble();
                //precondition, price >= 0 and isNumeric, quantity >= 0 and isNumeric
                //postcondition, discountedSubtotal >= 0
                if(quantity < 0){
                    System.out.println("quantity cannot be negative");
                    continue;
                }
                Item item = new Item(title, price, quantity);
                sale discountedSubtotal = new sale();
                discountedSubtotal.addItem(item);

                System.out.println("The total is " + discountedSubtotal.getDiscountedSubTotal());
                
            }
            catch(InputMismatchException e){
                System.out.println("the program area, cost and quantity values must be numeric");
                testVal = true;
            }
            catch(NumberFormatException e){
                System.out.println("day of the week cannot be numeric");
            }
            keyboard.nextLine();
            boolean testYesNO = true;
            do{
                //precondition, continueInput = y or no
                //postcondition, if y then continue, if n then terminate
                System.out.println("Do you want to add items? yes = y, no = n");
                String continueInput;
                continueInput = keyboard.nextLine();
                
                //precondition, continueInput = y or n
                //postcondition, if continueInput = y, add more items
                //postcondition, if continueInput = n, terminate program
                if(continueInput.equals("Y") || continueInput.equals("y")){
                    testYesNO = true;
                    testVal = true;
                }
                else if(continueInput.equals("N") || continueInput.equals("n")){
                    testYesNO = true;
                    testVal = false;
                }
                else if(!continueInput.equals("N") || !continueInput.equals("n") ||
                        !continueInput.equals("Y") || !continueInput.equals("y")){
                    System.out.println("The user must enter y for yes or n for no");
                    testYesNO = false;
                    testVal = false;
                }
                
            }while(testYesNO == false);
            
        }while(testVal == true);

    }
    
}
