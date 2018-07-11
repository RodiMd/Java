/*
 * Assignment5
 * CSCI 717
 * 12/4/2017
 * Rodi Murad
 */
package discountapp;
import java.util.*;

public class sale {
    private static double DISCOUNT_RATE = 0.05;

        private Vector itemList = new Vector(); 
                //p.332 starting out with Java
        public void addItem(Item item) { 
            itemList.addElement(item);
        } 

        public double getDiscountRate(){ 
            return DISCOUNT_RATE; 
	} 	 
 
        public double getDiscount(){ 
            return getSubTotal()*getDiscountRate(); 
	} 	 
 
        public double getSubTotal() { 
            double subTotal = 0.0; 
            Enumeration items = itemList.elements();  	 	
            while (items.hasMoreElements()) {  	 	 	
                Item theNextItem = (Item)items.nextElement(); 
                subTotal += theNextItem.getItemTotal(); 
            } 	 
        return subTotal; 
        } 
 	 
        public double getDiscountedSubTotal() {
            return getSubTotal() - getDiscount(); 
        }
    
}
