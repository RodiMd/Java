/*
 * Author: Rodi Murad
 * Class: CIT 130
 * Assignment #3
 * test program for counter class 
 * Date: 05/31/2015
 */
//package counterassignment;
import java.util.Scanner;

public class CounterAssignment {

    public static void main(String[] args) {
        
        //declaring value for the input to decrement or increment
        //declaring C1 & C2 is input initial values of the counters
        int value;
        int C1;
        int C2;
        
        //Scanner is needed to accept input from keyboard
        Scanner keyboard = new Scanner(System.in);
        
        //declaring counter1 and counter2 of the counter class
        counterClass counter1 = new counterClass(), counter2 = new counterClass();
        
        
        //ask user to input the initial values desired for the counters
        System.out.println("Please enter the desired initial value for counter1");
        C1 = keyboard.nextInt();
        System.out.println("Please enter the desired intitial value for counter2");
        C2 = keyboard.nextInt();
        
        //setting the setcounters values to what was entered by the user
        counter1.setCounter1(C1);
        counter2.setCounter2(C2);
        
        //shows the initial values the were entered and if they were equal
        System.out.println("The initial value of counters 1 & 2");        
        System.out.println("counter1 = " + counter1);
        System.out.println("counter2 = " + counter2);
        System.out.println("Does counter1 == counter2 ? " + counter1.equals(counter2));
        
        //ask user to enter a value 0 or 1 to decide whether to increment or decrement
        System.out.println("Please enter 0 to decrement or 1 to increment ");
        value = keyboard.nextInt();
        
        //condition 0 input means decrement and 1 means increment
        if (value == 0)
        {
            //decrement counters from the counterClass decrement method
            counter1.decrement();
            counter2.decrement();
            
            //gets the counters values then assign to C1 and C2 to check if below 0 value occured
            counter1.getCounter();
            C1 = counter1.getCounter();
            counter2.getCounter();
            C2 = counter2.getCounter();
            
            //condition that checks if counter value is below zero, if yes exits program
            if (C1 < 0 || C2 < 0)
            {
                System.out.println("Attempted to subtract from zero resulting in a negative value" +
                        " such a result is not acceptable, please revise the initial values if " +
                        "decrementing is desired");
                System.exit(0);
            }
            
            //if the value does not go below zero, then output of incremented values and if equal
            System.out.println("counter1 = " + counter1);
            System.out.println("Counter2 = " + counter2);
            System.out.println("Does counter1 == counter2 ? " + counter1.equals(counter2));
        }
        //if incrementing was chosen by entering the value 1 then jumps to the else 
        else
            {
            //increments the values of the counters
            counter1.increment();
            counter2.increment();
            
            //gets the counter values
            counter1.getCounter();
            counter2.getCounter();
            
            //counter values output and shows if equal of not
            System.out.println("counter1 = " + counter1);
            System.out.println("Counter2 = " + counter2);
            System.out.println("Does counter1 == counter2 ? " + counter1.equals(counter2));
        }
    } 
    
}
