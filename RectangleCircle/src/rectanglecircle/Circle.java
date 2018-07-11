/*
 * Author: Rodi Murad
 * Class: CIT 130
 * title: abstract & polymorphism
 * Assignment: #7
 * Date: 07/04/2015
 */
package rectanglecircle;

public class Circle extends Figure {
    
    int radius; //declare a radius integer
    
    public Circle(){
      super (0,0, "none");
      setRadius(0);  
    }
    public Circle(String n, int a, int b, int r){
        super(a, b, n);
        setRadius(r);
    }
    public String toString(){
        return "In "+ getName() +" Drawing centered at " + "(" + getX() +", "+ getY() +")"+
                " radius " + radius;
    }
    //erase method
    public void erase(){
        System.out.println("Circle erasing");
    }
    //draw method
    public void draw(){
        erase();
        System.out.println("" + this);
    }
    //accessor and mutator
    public void setRadius(int r){radius = r;}
    public int getRadius(){return radius;}
}
