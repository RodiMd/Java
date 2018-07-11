/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodi
 */
public abstract class Figure {
    
private int X, Y; // the center of the object. 
private String name; 
private static int numberOfShapes=0; 
public Figure(){ X = 0; Y = 0; name = "none"; } 
public Figure(int a, int b, String n)
{ 
    setX(a); setY(b); setName(n); numberOfShapes++; 
} 
public void setX(int a)
{
    X = a;
} 
public void setY(int b)
{
    Y = b;
} public void setName(String n)
{
    name = n;
} 
public int getX()
{
    return X;
} public int getY()
{
    return Y;
}
public String getName()
{
    return name;
}
public static int getNumberOfShapes()
{
    return numberOfShapes;
}
public abstract void erase(); 
public abstract void draw(); 
public void center()
{
    System.out.println("\nIn Figure. Centering at ("+getX()+","+getY()+")"); 
}
}
