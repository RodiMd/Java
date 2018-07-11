/*
 * Rodi Murad
 */
package squarerectangle;
//invariance hold true here since the input parameters are passed on without modification
public class Rectangle {
    private double width;
    private double length;
    
    public Rectangle(double w, double l){
        width = w;
        length = l;
    }
    public void setWidth(double w){
        width = w;
    }
    public void setLength(double l){
        length = l;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    //area and perimeter are postconditions, where if all parameters were entered correctly
    //based on the preconditions, the area and perimeter will always be assured
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return width + length;
    }
       
}
