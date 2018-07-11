
import java.io.*;

public class MyTextFileHandler extends java.lang.Exception {

    private String fname = "";

    public MyTextFileHandler() {
    }

    public MyTextFileHandler(String f) {
    	super("File Does Not Exist");    	
    	fname = f;
    }
    
    public PrintWriter createOutputTextFile() throws MyException{
    	PrintWriter pw = null;
    	try{
    	   // put PrintWriter pw on this line
    	   // try with true, false and move true out one set of parenthesis	
    	   //
    	   // line below is the same as
    	   // FileOutputStream fos = new FileOutputStream(fname+".txt",false);
    	   // pw = new PrintWriter(fos);
    	   // but nobody writes it like that
    	   pw = new PrintWriter(new FileOutputStream(fname+".txt",false)); 
    	}
    	catch (FileNotFoundException e){
    		System.out.println(e);
    		throw new MyException("The file could not be created.");
    	}
    	return pw;
    }
    
    public String getFname(){
    	return fname;
    }
    public void setFname(String f){
    	fname = f;
    }
}