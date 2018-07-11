/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexdemo;
public class ComplexDemo {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex(9,13);
        Complex c3 = new Complex(3.14159,8);
        System.out.println("c3 = " + c3);
        System.out.println("c1 = " + c1 + " c2 = " + c2);
        System.out.println("c1.equals(c2) is " + c1.equals(c2));
        System.out.println("the real part of c1 = " + c1.getReal());
        c1.setReal(9);
        c1.setImag(13);
        System.out.println("the real part of c1 = " + c1.getReal());
        System.out.println("c1 = " + c1 + " c2 = " + c2);
        System.out.println("c1.equals(c2) is " + c1.equals(c2));
        System.out.println("c1 + c2 = " + c1.add(c2));
    }
    
}
