/*
 * Author: Rodi Murad
 * Class: CIT 130
 * Assignment #3
 * test program for counter class 
 * Date: 06/01/2015 
 */
package counterassignment3;

public class CounterClass3 {
    
    //declare a private integer counter
    private int counter;
    
    //initializing counter1 to a value equals 0
    public void counter(){
        counter = 0;
    }
        
    //increment the counter value by 1
    public void increment(){
        counter++;
    }
    
    //decrement the counter value by 1
    public void decrement(){
        counter--;
    }
    
    //mehtod called add which is used to add one to counter1
    public void Add1(){
        setCounter(getCounter() + 1);
    }
    
    //return the updated value of counter1
    public int getCounter(){
        return counter;
    }
    
    //setting the value of newCounter equal to counter to use for the add mehtod above
    public void setCounter(int newCounter){
        counter = newCounter;
    }
    
    //allows to read the counter values in the output window
    public String toString(){
        return "" + counter;
    }
    
    //allows to check if counters are equal or not
    public boolean equals(CounterClass3 C){
        return this.getCounter() == C.getCounter();
    }
    
}
