/*
 * Assignment3
 * Bank Account
 * 10/25/2017
 * Rodi Murad
 */
//////////////////////////////////////****************************************
//ensure to add error checking for invalid input error
//all values entered by user must be positive
//amount should always be numerical, if not throw error
//
//////////////////////////////////////****************************************

package account;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Account {

    public static void main(String[] args)throws CloneNotSupportedException{
        //scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //clone customer object, bankAccountClone is the class name, customerMain is an object
        BankAccountClone customerMain = new BankAccountClone();//this is a constructor
        BankAccountClone customerCloneMain = (BankAccountClone)customerMain.clone();
                
        //conditional variable to loop through methods for bankAccount
        boolean operation = false;
        
        //do-while loop to allow to loop through options until customer decides to end session
        do{
            System.out.println("What would you like to do?");
            System.out.println("Type c for check balance, d for deposit, w for withdraw ");
            String input;
            
            //scanner class method to read user input
            input = keyboard.nextLine();
            
            //declare the amount variable for the deposit and withraw 
            // the declaration is placed as close as possible to reduce the span
            double amount;
            double amountClone;
            switch(input){
                          
                case "c":
                case "C":
                    //the statements print the balance of the main account and its clone
                    System.out.println("The account balance is: " + customerMain.customer.getBalance());
                    System.out.println("The clone account balance is: " + customerCloneMain.customer.getBalance());
                    break;//included to break out of the switch/case
                //invoke the deposit method if user choses d
                case "d":
                case "D":
                    //write an exception to ensure only numerical values are entered for amount and amountClone
                    //this exception is a precondition to the amount and amountClone for valid results
                    try{
                        System.out.println("Enter the deposit amount to account ");
                        amount = keyboard.nextDouble();
                        System.out.println("Enter the deposit amount to clone account ");
                        amountClone = keyboard.nextDouble();
                        
                        if (amount < 0 || amountClone < 0){
                            amountGreaterThanZero(amount, amountClone);
                            keyboard.nextLine();
                            continue;
                        }
                        
                        //takes the user's amount input and passes it to the deposit method in 
                        //BankAccount class to add to balance
                        customerMain.customer.deposit(amount);//this is an instance veriable
                        customerCloneMain.customer.deposit(amountClone);
                        
                        System.out.println("The account balance is: " + customerMain.customer.getBalance());
                        System.out.println("The clone account balance is: " + customerCloneMain.customer.getBalance());
                    }catch (InputMismatchException e){
                        //nonNumeric = true;
                        System.out.println("The value enter was non-numeric ");
                        //this is used to prevent keyboard buffer from occurring
                        //where the input to continue or not is skipped
                        //this is placed inside the try/catch to ensure that if exception is cought
                        //the input string keyboard is still cleared
                        keyboard.nextLine();
                        break;
                    }
                    
                    //this is used to prevent keyboard buffer from occurring
                    //where the input to continue or not is skipped
                    //this statement is placed outside in the case when exception is not thrown
                    keyboard.nextLine();
                    break;
                //invoke the withdraw method if user choses w
                case "w":
                case "W":
                    try{
                        System.out.println("Enter the withdraw amount from account ");
                        amount = keyboard.nextDouble();
                        System.out.println("Enter the withdraw amount from clone account ");
                        amountClone = keyboard.nextDouble();
                        //check if user entered a value less than zero
                        if (amount < 0 || amountClone < 0){
                            amountGreaterThanZero(amount, amountClone);
                            keyboard.nextLine();
                            continue;
                        }
                        
                        //pass the amount argument to the withdraw method
                        customerMain.customer.withdraw(amount);
                        customerCloneMain.customer.withdraw(amountClone);
                        //print the balance 
                        System.out.println("The account balance is: " + customerMain.customer.getBalance());
                        System.out.println("The clone account balance is: " + customerCloneMain.customer.getBalance());
                    }catch(InputMismatchException e){
                        
                        System.out.println("The value entered was non-numeric ");
                        keyboard.nextLine();
                        break;
                    }
                    //this is used to prevent keyboard buffer from occurring
                    //where the input to continue or not is skipped
                    keyboard.nextLine();
            }
            
            //variables passed to the equality test
            double customerMainTest = customerMain.customer.getBalance();
            double customerCloneMainTest = customerCloneMain.customer.getBalance();
            //if input does not equal the options listed, the message is printed to tell
            //the user that one of the options must be used, otherwise the equality will not be tested
            if (input.equals("c") || input.equals("C") || input.equals("d") || input.equals("D") || input.equals("w") || input.equals("W")){
                testEquality(customerMainTest, customerCloneMainTest);
            }
            //part of defensive programming to ensure user is only allowed to enter the permited values
            else{
                System.out.println("The input value must be c, d, or w");
            }
            // message printed to see if the user wants to complete anymore transaction
            System.out.println("Do you wish to complete anymore transation? type y for yes or n for no!");  
            input = keyboard.nextLine();
            
            //defensive programming method used to test users' input, if does not fall
            //within the required input, the user is asked again to enter the correct values
            if (input.equals("y") || input.equals("Y")){
                //precondition input, operation is correct and
                //the application will continue to complete more transaction
                operation = true;
            }
            else if (input.equals("n") || input.equals("N")){
                //precondition input, values entered as required
                //application will terminate by changing the operation value to false
                operation = false;
            }
            //defensive programming measure to ensure that the user fullfills required input
            //if not the application will print message and prevent from termination and continue operation
            //with more options to choose from
            else if (!input.equals("y") || !input.equals("Y") || !input.equals("n") || !input.equals("N")){
                System.out.println("To continure or terminate operation, must type y or n");
                operation = true;
            }
            
            //loop termination or continuation depending on the chosen option by user
        }while(operation == true);
    }
    //static class to test equality of the two objects
    public static void testEquality(double CMT, double CCMT){
        //********************************************************
        //routine to test if objects' instances are equal
        //CMT and CCMT stand for cutomerMainTest and customerCloneMainTest respectively
        String CMTString = Double.toString(CMT);
        String CCMTString = Double.toString(CCMT);

        if (CMTString.equals(CCMTString)){
            System.out.println("the account balance and its clone are equal ");
        }
        else{
            System.out.println("the account balance and its clone are not equal ");
        }
        //********************************************************
    }
    //print message that value for amount and amountClone is equal or greater than zero
    public static void amountGreaterThanZero(double amt, double amtClone){
        
        if (amt < 0 || amtClone < 0){
            System.out.println("The entered value must be equal to or greater than zero");
        }
    }
    public double assertTrueTester(double amount){
        double blnc = 0;
        
        blnc = blnc + amount;
        return blnc;
    }
}
