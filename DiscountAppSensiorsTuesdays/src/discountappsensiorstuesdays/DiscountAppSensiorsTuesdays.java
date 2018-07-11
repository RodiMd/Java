/*
 * Assignment5
 * CSCI 717
 * 12/4/2017
 * Rodi Murad
 */
package discountappsensiorstuesdays;
import java.util.*;

public class DiscountAppSensiorsTuesdays {

    public static void main(String[] args) throws Exception{
        Scanner keyboard = new Scanner(System.in);
        
        String dayOfWeek = "";
        int programArea = 0;
        String title = "";
        double price = 0.0;
        double quantity = 0.0;
        boolean testVal=true;
        
        do{
            try{
                System.out.println("Enter the first two letters of the day of the week e.g. tu = Tuesday");
                dayOfWeek = keyboard.next();
                //precondition, dayOfWeek != digits, dayOfWeek.length < 2, dayOfWeek.length > 2
                //postcondition, if dayOfWeek = tu then senior discount
                if(!dayOfWeek.matches("[a-zA-Z]+") || dayOfWeek.length() > 2 || dayOfWeek.length() < 2){
                    System.out.println("day of week must only contain letters and cannot be less or more than two letters");
                    continue;
                }
                System.out.println("Enter customer code 0 for customer, 1 for senior, and 2 for preferred customer");
                programArea = keyboard.nextInt();
                //precondition, 0 <= programArea <-=2, and isNumeric
                //postcondition, Discounts = 0.05 or 0.1, or 0.15
                if(programArea < 0 || programArea > 2){
                    System.out.println("program area must be between 0 and 2");
                    continue;
                }
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
                Item item = new Item(dayOfWeek, programArea, title, price, quantity);
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
