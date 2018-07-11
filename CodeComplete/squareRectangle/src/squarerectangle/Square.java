/*
 * Square subclass of the rectangle baseclass
 * Rodi Murad
 */
package squarerectangle;
//invariance does not hold true here since in order for us to obtain a square
// we must modify one of the input parameters to adhere to preconditions, therefore
// invariance is broken
public class Square extends Rectangle{
    private double width;
    private double length;
    public Square(double w, double l){
        super(w, l);
        width = l;
        length = l;        
    }
    public void setWidth(double l){
        width = l;
    }
    public void setLength(double l){
        length = l;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return width + length;
    }

}

