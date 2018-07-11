/*
 * Author: Rodi Murad
 * Class: CIT 130
 * Assignment #3
 * Counter Class
 * Date: 05/31/2015
 */
package counterassignment;

public class counterClass {
    
    //initialize an int counter privately (only accessed by this class)
    private int counter;
    
    //setting the setCounter1 value to initialValue1 so it can be set by the user
    public void setCounter1(int initialValue1){
        counter = initialValue1;
    }
    
    //setting the setCounter1 value to initialValue2 so it can be set by the user
    public void setCounter2(int initialValue2){
        counter = initialValue2;
    }
    
    //increment the counter value by 1
    public void increment(){
        counter++;
    }
    
    //decrement the counter value by 1
    public void decrement(){
        counter--;
    }
    
    //returns the counter value
    public int getCounter(){
        return counter;
    }
    
    //returns coutner string that represents the state of the object
    public String toString(){
        return "" + counter;
    }
    //equals true/false to compare equality of counters in a class
    public boolean equals(counterClass C){
        return this.getCounter() == C.getCounter();
    }

}
