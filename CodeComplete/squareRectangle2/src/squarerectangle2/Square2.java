/*
 * Rodi Murad
 */
package squarerectangle2;
//class invariant ensure that the length and width do not change from the square2 class
//to the rectangle2 class
public class Square2 {
    private double width;
    private double length;
    
    public Square2(double w, double l){
        width = w;
        length = l;
    }
    public void setWidth(double w){width = w;}
    public void setLength(double l){length = l;}
    public double getWidth(){return width;}
    public double getLength(){return length;}
    //area and perimeter are postconditions, given input is in accordance with preconditions
    //the area and perimeter will always be assured
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return width + length;
    }
    
}
