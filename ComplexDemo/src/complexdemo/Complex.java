/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexdemo;

public class Complex {
    
    // define state
    //___________________________________________________
    int r, i;
    
    //Define Behavior
    //___________________________________________________
    
    // constructors

    // default constructor
    public Complex(){
        r = 0; 
        i = 0;
    }
    // overload constructor
    public Complex(int real, int imag){
        r = real;
        i = imag;
    }
    public Complex(double real, double imag){
        r = (int)real;
        i = (int)imag;
    }
    
    // accessors
    public int getReal(){
        return r;
    }
    public int getImag(){
        return i;
    }
    // mutators
    public void setReal(int real){
        r = real;
    }
    public void setImag(int imag){
        i = imag;
    }
    
    // overrides of class Object
    public String toString(){
        return "" + getReal() + " + i" + getImag();
    }
    public boolean equals(Complex c){
        return this.getReal()==c.getReal() && this.getImag() == c.getImag();
    }
/* Same method but passing base class Object type
    public boolean equals(Object co){
        Complex c = (Complex)co;
        return this.getReal()==c.getReal() && this.getImag() == c.getImag();
    }
  */  
    // Complex utility methods

    public Complex add(Complex c){
        Complex returnComplex = new Complex(getReal()+c.getReal(),
                                           getImag()+c.getImag());
        return returnComplex;
    }
  
}
