/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionswithfileiodemo;

import java.util.Scanner;
import java.io.*;

public class ExceptionsWithFileIODemo {
        
    
    public static void main(String[] args) {
    	Scanner userConsoleInput = new Scanner(System.in);
    	// code that only throws an exception
    	try{
    		throw new Exception("That is exceptional code!");
    		//System.out.println("Do I get here?"); // try putting this code in and see what happens
    	}
    	catch(Exception e){
    		
    		System.out.println(e);
    		
    		// without the preface java.lang.Exception:
    		System.out.println(e.getMessage());
    	}
    	
    	// throws the exception I designed
    	try{
    		throw new MyException("Using MyException");
    	}	
        catch(MyException e){
        	System.out.println(e);
        }
        
        // randomly throws either Exception or myException
        for(int i=0; i< 5; i++){
        	try{
        	
        	   if(Math.random() < 0.5)
        		  throw new Exception("In loop: Exception thrown"); 
        	   else
        		  throw new MyException("In loop: MyException thrown"); 
        	}
        	
        	// note the order of the catch blocks - try reversing them.
        	catch(MyException e){
        	   System.out.println(e);        		
        	}
//        	catch(Exception e){
//        	   System.out.println(e);        		
//        	}
        	finally{
        		System.out.println("Phew, through the try catch");
        	}
        }
        
        // now to try some file stuff.
        boolean dofile = true;
        String yn = "n", fname = "", bt = "b";
        PrintWriter textOut = null;
        ObjectOutputStream binaryOut = null;
        ObjectInputStream binaryIn = null;
        MyTextFileHandler mto = null;
        MyBinaryFileHandler mbo = null;
        do{
        	
        	// try Ken.txt where Ken.txt is already a folder
        	System.out.println("Enter the name of the file - do not include the extention.");
        	
        	// user enters file name sans extention which will be added in Text or Binary class
        	fname = userConsoleInput.nextLine();
        	
        	// see if user wants text or binary file and take action
        	System.out.println("Binary or Text (b/t)");
        	bt = userConsoleInput.nextLine();
        	if(bt.equals("b")){
        		System.out.println("You have chosen Binary");
        		mbo = new MyBinaryFileHandler(fname);
        		try{
        		   binaryOut = mbo.createBinaryOutputFile();
        		}
        		catch (MyException e){
        			System.out.println(e);
        		}
        		finally{
					System.out.println("Writing Binary Data to File.");
        			try{
							// note that writeInt works with the Integer object or int
             			binaryOut.writeInt(42);
             			binaryOut.writeInt(new Integer(17));
							binaryOut.writeDouble(3.14159);
							
							// will work with any object.
							binaryOut.writeObject(new TestObject());
			 				binaryOut.close();
							binaryOut.flush();          			}
			 		catch(IOException e){
           				System.out.println(e);
        			}
        		}

				try{
					binaryIn = mbo.createBinaryInputFile();
				}
				catch(MyException me){
					System.out.println(me);
				}
				finally{
					System.out.println("Reading Binary Data");
					try{
						System.out.println(binaryIn.readInt());	
						System.out.println(binaryIn.readInt());	
						System.out.println(binaryIn.readDouble());
						System.out.println((TestObject)binaryIn.readObject());	
						binaryIn.close();
					}
					catch(IOException ioe){
						System.out.println(ioe);
					}
					catch(ClassNotFoundException cnfe){
					}
				}
        	}
        	else if(bt.equals("t")){
        		System.out.println("You have chosen Text");
        		mto = new MyTextFileHandler(fname);
        		try{
        		   textOut = mto.createOutputTextFile();
        		}
        		catch (MyException e){
        			System.out.println(e);
        		}
        		finally{
        		   Scanner scanFile = null;
        		   System.out.println("Writing to File");
        		   textOut.println("42");
        		   textOut.println("The answer to life, the universe, everything.");
        		   textOut.println("3.14159");
        		   textOut.close(); // remove this line - what happens?
        		   textOut.flush();
        		   try{
            		   scanFile = new Scanner(new FileInputStream(fname+".txt")); // put scanner in front
        		   }
        		   catch(FileNotFoundException e){
        		   }
					System.out.println("Reading from file");
        		   System.out.println(scanFile.nextLine());
        		   System.out.println(scanFile.nextLine());
        		   System.out.println(scanFile.nextLine());        		   
        		}
        	}
        	else
        		System.out.println("What kind of bizzare choice is " + bt);
        		
        	// see if user wants to continue
        	System.out.println("Would you like to do another file? (y/n)");
        	yn = userConsoleInput.nextLine();
        	if(yn.equals("n"))
        		dofile = false;
        }while(dofile);
    }  
}