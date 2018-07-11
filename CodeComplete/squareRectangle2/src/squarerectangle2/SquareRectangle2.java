/*
 * Assignment2
 * CSCI 717
 * Rodi Murad
 * 9/22/2017
 */
package squarerectangle2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class SquareRectangle2 {

    public static void main(String[] args) {
    
    double width = 0;
    double length = 0;
    do{
        //precondition to ensure that all entries are numeric
        try{
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter the width of the object");
            width = keyboard.nextDouble();
            System.out.println("Enter the length of the object ");
            length = keyboard.nextDouble();
            //precondition ensures that length and width values are greater than zero
            if (width <= 0 || length <= 0){
                System.out.println("The values entered must be greater than zero ");
            }
            //precondition ensures that the entry is for equal sides of the square
            else if(width != length){
                System.out.println("Width and length should be equal");
            }
            else{
                System.out.println("Success, the entered values adhered to conditions");
            }
        }
        catch(InputMismatchException e){
            System.out.println("The input value must be numeric ");
        }
    }while(width <= 0 || length <= 0 || width != length);
    Square2 square2 = new Square2(width, length);
    Rectangle2 rectangle2 = new Rectangle2(width, length);
    
    System.out.println("The area of the square is: " + square2.getArea());
    System.out.println("The perimeter of the square is: " + square2.getPerimeter());
    
    System.out.println("The area of the rectangle is: " + rectangle2.getArea());
    System.out.println("The perimeter of the rectangle is: " + rectangle2.getPerimeter());
    
    }
    
}
