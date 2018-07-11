/*
 * Assignment 2
 * CSCI 717
 * Rodi Murad
 * 9/22/2017
 */
package squarerectangle;
import java.util.Scanner;
import java.util.InputMismatchException;

public class SquareRectangle {

    public static void main(String[] args) {

        double width = 0;
        double length = 0;
        
        //preconditions - entered value is numeric and greater than zero
        do{
            try
            {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Enter the width of the object: ");
                width = keyboard.nextDouble();
                System.out.println("Enter the length of the object: ");
                length = keyboard.nextDouble();
                if (width <= 0 || length <= 0){
                    System.out.println("The values entered must be greater than zero ");
                }
                else if  (width > length){
                    System.out.println("width should not be greater than length ");
                }
                else{
                    System.out.println("Success, the entered values adhered to conditions");
                }
            }
            catch(InputMismatchException e){
                System.out.println("The value must be numeric");
            }
            //the while represents a loop invariant to ensure that condition hold true each iteration
        }while(width<=0 || length <=0 || width > length);
        
        Rectangle rectangle1 = new Rectangle(width, length);
        Square square1 = new Square(width, length);
        
        System.out.println("The area of the rectangle is: " + rectangle1.getArea());
        System.out.println("The perimeter of the rectangle is: " + rectangle1.getPerimeter());
        
        System.out.println("The area of the square is: " + square1.getArea());
        System.out.println("The perimeter of the square is: " + square1.getPerimeter());
        
        
        //
//        if (rectangle1.isWidthEqualLength()){
//            System.out.println("You have a square");
//            System.out.println("The area of square is: " + square1.getArea());
//            System.out.println("The perimeter of square is: " + square1.getPerimeter());    
//        }
//        else{
//            System.out.println("You have a rectangle");
//            System.out.println("The area is: " + rectangle1.getArea());
//            System.out.println("The perimeter is: " + rectangle1.getPerimeter());
//        }
    }
}
