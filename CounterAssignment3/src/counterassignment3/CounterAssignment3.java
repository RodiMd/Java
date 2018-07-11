/*
 * Author: Rodi Murad
 * Class: CIT 130
 * Assignment #3
 * test program for counter class 
 * Date: 06/01/2015
 */
package counterassignment3;

public class CounterAssignment3 {
    
    public static void main(String[] args) {
        
        //declaring two integers used for if statement below to check if values below 0
        int C1;
        int C2;
        
        //declaring counter1 and counter2 of the counter class
        CounterClass3 counter1 = new CounterClass3(), counter2 = new CounterClass3();
        
        //prints the initial values of the counters and shows if equal
        System.out.println("Initial values for counter 1 & 2");
        System.out.println("Counter1 == " + counter1);
        System.out.println("Counter2 == " + counter2);
        System.out.println("Does counter1 == counter2? " + counter1.equals(counter2));
        
        //decrements then updates the value and is set to the integers declared above
        //the declared integers are used for the if statement found below
        counter1.decrement();
        counter1.getCounter();
        C1 = counter1.getCounter();
        counter2.decrement();
        counter2.getCounter();
        C2 = counter2.getCounter();
        
        //checks if the decremented values are less than 0 then give a message to reset values
        System.out.println("Decrementing values");
        if (C1 < 0 || C2 < 0){
            System.out.println("The resulted values of the counters are negative" + 
                    " (less than 0), such results are not acceptable, reset values to 0");
        }
        
        //rests the value of the counters after operation 1 decrement
        counter1.counter();
        counter2.counter();
        
        //increments and gets the new value of the counters
        counter1.increment();
        counter1.getCounter();
        counter2.increment();
        counter2.getCounter();
        
        //prints the updated incremented values and shoes if equals true/false
        System.out.println("");
        System.out.println("Incrementing counters equals (true)");
        System.out.println("Incremented counter1 == " + counter1);
        System.out.println("Incremented counter2 == " + counter2);
        System.out.println("Does counter1 == counter2? " + counter1.equals(counter2));
        
        //reset the value of the counters to 0
        counter1.counter();
        counter2.counter();
        
        //adds 1 unit to counter1 to get the equals false condition
        counter1.Add1();
        
        //gets the updated values of the counters after incrementing
        counter1.increment();
        counter1.getCounter();
        counter2.increment();
        counter2.getCounter();
        
        //prints the updated/incremented values of the counters and shows if final result is equal
        System.out.println("");
        System.out.println("Incrementing counters equals (false)");
        System.out.println("Counter1 == " + counter1);
        System.out.println("Counter2 == " + counter2);
        System.out.println("Does counter1 == counter2? " + counter1.equals(counter2));
    }
    
}
