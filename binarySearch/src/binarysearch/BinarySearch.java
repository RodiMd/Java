/*
 * Author: Rodi Murad
 * Class: CIT130
 * Assignment: 10
 * Title: Generic Binary Search
 * Date: 7/21/2015
 */
package binarysearch;
import java.util.Scanner;
import java.lang.String;

public class BinarySearch {

    public static void main(String[] args) {
        
        int result = 0;
        String key;//input was declared as a string because if input is numeric
                    // I was able to convert to integer, but couldnt convert back
        String input;
        char ch;
        
        Integer[] numbers = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18}; 
        String[] fruits = {"apple", "orange", "peach", "strawberry", "watermellon"};
        
        //loops to print the arrays so the user will know what to look for
        //to check if program works
        for (int i = 0; i < numbers.length; i++){
           System.out.print(numbers[i] + " ");
        }
        System.out.println("");
        for (int j = 0; j < fruits.length; j++){
            
            System.out.print(fruits[j] + " ");
        }
        
        Scanner keyboard = new Scanner(System.in);
        
        //the do is used so the user will have the option to terminate the program when desired
        do{
            System.out.println("");
            System.out.println("Please enter a value to search for");
            input = keyboard.nextLine();

            ch = input.charAt(0);

            if (Character.isDigit(ch)){
                key = input;
                result = gbSearch.<Integer>Search(numbers, 0, 10, Integer.parseInt(key));
            }
            else if (Character.isLetter(ch)){
                //needed for a conversion error
                try{
                    key = input;
                    result = gbSearch.<String>Search(fruits, 0, 10, key);
                }//was getting a conversion error initially,
                    //however after revisions to the code I didn't get it, but left it just in case
                catch(NumberFormatException e){
                    System.out.println("Conversion error: " + e.getMessage());
                }
            }

            if (result == -1){
                System.out.println(" was not found in the array");
            }
            else{
                System.out.println("found at " + result);
            }
            
            System.out.println("Would you like to continue? (Y/N) ");
            input = keyboard.nextLine();
            
        }while(input.equals("y"));
        
        System.exit(0);
    }
}
