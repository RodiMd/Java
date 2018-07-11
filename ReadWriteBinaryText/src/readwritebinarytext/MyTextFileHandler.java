/*
 * Author: Rodi Murad
 * Class: CIT 130
 * Assignment: Assignment 8 part 2
 * Title: Read/Write binay & text files
 * Date: 7/14/2015
 */
package readwritebinarytext;
import java.io.*;

public class MyTextFileHandler extends java.lang.Exception {

    private String name = "";

    public MyTextFileHandler() {
    }

    public MyTextFileHandler(String f) {
    	super("File Does Not Exist");    	
    	name = f;
    }
    
    public PrintWriter createOutputTextFile() throws MyException{
    	PrintWriter pw = null;
    	try{
    	   // put PrintWriter pw on this line
    	   // try with true, false and move true out one set of parenthesis	
    	   
    	   pw = new PrintWriter(new FileOutputStream(name+".txt",false)); 
    	}
    	catch (FileNotFoundException e){
    		System.out.println(e);
    		throw new MyException("The file could not be created.");
    	}
    	return pw;
    }
//    public FileReader createInputTextFile() throws MyException{
//        FileReader fr = null;
//        try{
//            fr = new FileReader(new FileInputStream(name+".txt"));
//        }
//        catch(EOFException e){
//            System.out.println(e);
//        }
//        return fr;
//    }
    
    public String getFname(){
    	return name;
    }
    public void setFname(String f){
    	name = f;
    }

}
