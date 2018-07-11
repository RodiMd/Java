/*
 * Author: Rodi Murad
 * Class: CIT 130
 * Assignment: Assignment 8 part 2
 * Title: Read/Write binay & text files
 * Date: 7/14/2015
 */

package readwritebinarytext;
import java.io.*;

public class MyBinaryFileHandler extends java.lang.Exception {

    private String name = "";

    public MyBinaryFileHandler() {
    }

    public MyBinaryFileHandler(String f) {
    	super("File Does Not Exist");    	
    	name = f;
    }
    
    public ObjectOutputStream createBinaryOutputFile() throws MyException{
    	ObjectOutputStream oos = null;
    	try{
    	   // put ObjectOutputStream pw on this line
    	   // try with true, false and move true out one set of parenthesis	
    	   oos = new ObjectOutputStream(new FileOutputStream(name+".dat",false)); 
    	}
    	catch (Exception e){
    		System.out.println(e);
    		throw new MyException("The file could not be created.");
    	}
    	return oos;
    }
    public ObjectInputStream createBinaryInputFile() throws MyException{
        
    	//ObjectInputStream ois = null;
        ObjectInputStream ois = null;
    	try{
    	   // put ObjectOutputStream pw on this line
    	   // try with true, false and move true out one set of parenthesis	
    	   ois = new ObjectInputStream(new FileInputStream(name+".dat")); 
    	}
    	catch (IOException e){
    		System.out.println(e);
    		throw new MyException("The file could not be created.");
    	}
    	return ois;
//        FileInputStream fis= null;
//    	try{
//    	   // put ObjectOutputStream pw on this line
//    	   // try with true, false and move true out one set of parenthesis	
//    	   fis = new FileInputStream(name+".dat"); 
//           System.out.println("Creating file " + name + ".dat");
//    	}
//    	catch (FileNotFoundException e){
//    		System.out.println(e + "couldn't open file!!!!!");
//    		throw new MyException("The file could not be created.");
//    	}
//        try{
//        ois = new ObjectInputStream(fis); 
//        }
//        catch (IOException ioe){
//            System.out.println(ioe + " couldn't create wrapper object!!!");
//        }
//    	return ois;
    }
    
    public String getFname(){
    	return name;
    }
    public void setFname(String f){
    	name = f;
    }
}
