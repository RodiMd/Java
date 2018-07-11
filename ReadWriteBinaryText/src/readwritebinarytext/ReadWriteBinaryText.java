/*
 * Author: Rodi Murad
 * Class: CIT 130
 * Assignment: Assignment 8 part 2
 * Title: Read/Write binay & text files
 * Date: 7/14/2015
 */
package readwritebinarytext;
import java.io.*;
import java.util.Scanner;

public class ReadWriteBinaryText{

    public static void main(String[] args) {
        String name; //name of the file
        String fileType; //type of file
        String actionType; //the action implemented on the file
        String lineText; 
        String r = "r", w = "w", b = "b", t = "t", y = "y", n = "n";
        String cont = "";
        
        PrintWriter textOut = null;
        ObjectOutputStream binaryOut = null;
        ObjectInputStream binaryIn = null;
        MyTextFileHandler mto = null;
        MyBinaryFileHandler mbo = null;
                
        Scanner keyboard = new Scanner(System.in);
        
        do
        {
            System.out.println("Enter the file name: ");
            name = keyboard.nextLine();

            System.out.println("Choose binary or text file (b/t): ");
            fileType = keyboard.nextLine();
            
            if (fileType.equals(b))
            {
                
                System.out.println("Choose read or write (r/w): ");
                actionType = keyboard.nextLine();

                if (actionType.equals(w))
                {
                        mbo = new MyBinaryFileHandler(name);
                    try{
                        binaryOut = mbo.createBinaryOutputFile();
                    }
                    catch(MyException e){
                        System.out.println(e);
                    }
                    
                    //do{
                        try{
                            System.out.println("Enter the line of information to write to file: ");
                            lineText = keyboard.nextLine();
                            binaryOut.writeObject(lineText);
                            //binaryOut.writeUTF(lineText);
                            binaryOut.close();
                        }
                        catch(IOException e)
                        {
                            System.out.println(e);
                        }
                        //if chosen to write on the file then use this option to write info
//                        try{
//                            System.out.println("would you like to add another line? (y/n):");
//                            actionType = keyboard.nextLine();
//                        }
//                        catch(Exception e)
//                        {
//                            System.out.println(e);
//                        }
                        
                    //}while(actionType.equals(y));
                }
                else if (actionType.equals(r))
                {
                    try{
                        binaryIn = mbo.createBinaryInputFile();
                    }
                    catch(MyException me){
                        System.out.println(me + " in myException");
                    } 
                    finally{
                        try{
                            System.out.println(binaryIn.readObject());
                        // System.out.println(binaryIn.readObject());
                        binaryIn.close();
                        }
                        catch(IOException ioe){
                            System.out.println(ioe);
                        }
                        catch(ClassNotFoundException e){
                            System.out.println(e);
                        }
                    }
                    
                    
//                    finally{
//                        try{
//                            
//                        }
////                        catch (EOFException ioe)
////                        {
////                            System.out.println(ioe);
////                        }
//                        catch(IOException ioe){
//                            System.out.println(ioe);
//                        }
//                        
////                        catch(ClassNotFoundException cfne){
////                            System.out.println(cfne);
////                        }
//                    }
                }
            }
            else if (fileType.equals(t))
            {
                System.out.println("Choose read or write (r/w): ");
                actionType = keyboard.nextLine();
                
                     //the do-while is used for the continuation of adding lines of text  to the file
                   
                    if (actionType.equals(w))
                    {
                        do 
                        {

                            mto = new MyTextFileHandler(name);
                            try{
                                textOut = mto.createOutputTextFile();
                        }
                            catch (MyException e){
                                System.out.println(e);
                        }
                            finally{
                                Scanner scanFile = null;
                                System.out.println("Enter the line of information to write to file: ");
                                lineText = keyboard.nextLine();
                                textOut.println(lineText); 
                                textOut.close();
                            }
                            //if chosen to write on the file then use this option to write info

                            System.out.println("would you like to add another line? (y/n):");
                            actionType = keyboard.nextLine();

                        }while(actionType.equals(y));
                    }
                    else if(actionType.equals(r))
                    {
                        Scanner scanFile = null;
                        try{
                            scanFile = new Scanner(new FileInputStream(name+".txt"));
                        }
                        catch(Exception e){
                            System.out.println(e);
                        } 
                        System.out.println(scanFile.nextLine());
                    }
                    
                System.out.println("Continue?");
                cont = keyboard.nextLine();

                if (cont.equals(n))
                {
                    System.exit(0);
                }
            }
        }while (cont.equals(y));
        
    }
    
}
