/*
 * Author: Rodi Murad
 * Class: CIT 130
 * title: abstract & polymorphism
 * Assignment: #7
 * Date: 07/04/2015
 */
package rectanglecircle;

//Rectangle class extended from the Figure abstract class
public class Rectangle extends Figure{
    
    int width, height;
    
    public Rectangle(){
        super(0, 0, "none");
        width = 0;
        height = 0;
    }
    public Rectangle(String n, int a, int b, int w, int h){
        super(a, b, n);
        width = w;
        height = h;
    }
    
    public void setWidth(int w){width = w;}
    public void setHeight(int h){height = h;}
    public int getWidth(){return width;}
    public int getHeight(){return height;}
    
    public String toString(){
        return "In "+ getName() +" Drawing centered at " + "(" +getX() +
                ", "+ getY() +")"+ " width " + width + " height " + height;
    }
    public void erase(){
        System.out.println("Rectangle erasing");
    }
    public void draw(){
        erase();
        System.out.println("" + this);
    }
}
