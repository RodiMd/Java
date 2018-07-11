/*
 * Author: Rodi Murad
 * Class: CIT 130
 * Assignment: Assignment 8 part 2
 * Title: Read/Write binay & text files
 * Date: 7/14/2015
 */
package readwritebinarytext;

public class MyException extends Exception{

    	// default constructor
    	public MyException(){
    		super("default message");
    	}
    	
    	// set message constructor
    	public MyException(String s){
    		super(s);
    	}

}
