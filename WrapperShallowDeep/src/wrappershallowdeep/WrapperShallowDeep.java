/*
 * Author: Rodi Murad
 * Class: CIT 130
 * title: Deep and shallow copies
 * Assignment: #6
 * Date: 06/24/2015
 */
package wrappershallowdeep;

public class WrapperShallowDeep {

    public static void main(String[] args) 
    {
        //constructor of the shallow initial and copy objects
        WrapperShallow ws1 = new WrapperShallow();
        WrapperShallow ws2 = ws1;
        
        //constructor of the deep initial and copy objects
        WrapperDeep wd1 = new WrapperDeep();
        WrapperDeep wd2 = new WrapperDeep();
        
        //print the results for the initial and copy and the results after change
        System.out.println("Initial shallow object contains");
        System.out.println(ws1);
        System.out.println("Copy shallow object contains");
        System.out.println(ws2);
        ws1.seta();//resets the values using the mutator
        System.out.println("Initial shallow object changed to");
        System.out.println(ws1);
        System.out.println("Initial shallow object unchanged");
        System.out.println(ws2);
        
        //condition to check if the items are equal in the shallow initial and copy
        if (ws1.equals(ws2))
            System.out.println("WOOPS! ws1.equals(ws2) is " + ws1.equals(ws2));
        
        //print the results for the initial and copy and the results after change
        System.out.println("Initial deep object contains");
        System.out.println(wd1);
        System.out.println("Copy deep object contains");
        System.out.println(wd2);
        wd1.seta();//resets the value from the mutator
        System.out.println("Initial deep object changed to");
        System.out.println(wd1);
        System.out.println("Initial shallow object unchanged");
        System.out.println(wd2);
        
        //condition to check if the items are not equal if yes then result is true
        if (!wd1.equals(wd2))
            System.out.println("RIGHT! wd1.equals(wd2) is " + wd1.equals(wd2));
    }
    
}
