/*
 * Author: Rodi Murad
 * Class: CIT 130
 * title: abstract & polymorphism
 * Assignment: #7
 * Date: 07/04/2015
 */
package rectanglecircle;
public class RectangleCircle {

    public static void main(String[] args) {
        
        //constructor for the position of the rectangle object
        Rectangle positionR = new Rectangle();
        positionR.setX(25);
        positionR.setY(100);
        positionR.setName("Rectangle");
        positionR.setWidth(15);
        positionR.setHeight(10);
        
        //constructor for the position of the circle object
        Circle positionC = new Circle();
        positionC.setX(5);
        positionC.setY(10);
        positionC.setName("Circle");
        positionC.setRadius(3);
        
        //declare an array the holds the several extended classes, as the number grows 
        //the array size will grow with the getNumberOfShapes
        Figure[] array = new Figure[Figure.getNumberOfShapes()];
        array[0] = positionR;
        array[1] = positionC;
        
        //loop for the methods of extended classes from Figure abstract class
        for (int i = 0; i <= Figure.getNumberOfShapes() - 1; i++)
        {
            System.out.println(array[i].getName() + " centered at (" + array[i].getX()+ "," + array[i].getY()+")");
            array[i].draw();
            System.out.println("");
        }                 
    }
}
