/*
 * Author: Rodi Murad
 * Class: CIT 130
 * title: abstract & polymorphism
 * Assignment: #7
 * Date: 07/04/2015
 */
package rectanglecircle;

public abstract class Figure{
    
    private int X, Y;
    private String name;
    private static int numberOfShapes = 0;
    
    public Figure ()
    {
        X = 0;
        Y = 0;
        name = "none";
    }
    public Figure(int a, int b, String n)
    {
        X = a;
        Y = b;
        name = n;
        numberOfShapes++;
    }
    public void setX(int a){X = a;}
    public void setY(int b){Y = b;}
    public void setName(String n){name = n;}
    public int getX() {return X;}
    public int getY() {return Y;}
    public String getName() {return name;}
    public static int getNumberOfShapes() {return numberOfShapes;}
    public abstract void erase();
    public abstract void draw();
    
}
