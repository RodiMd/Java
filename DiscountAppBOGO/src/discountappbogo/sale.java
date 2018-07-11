/*
 * Assignment5
 * CSCI 717
 * 12/4/2017
 * Rodi Murad
 */
package discountappbogo;
import java.util.*;

public class sale {
    //invariants, discounts
    private static double DISCOUNT_RATE = 0.5;
    private double totalBill = 0;
    
        private Vector itemList = new Vector();
        
        public void addItem(Item item) { 
            itemList.addElement(item);
        }
        
        public double getDiscountRate(){ 
            return DISCOUNT_RATE; 
	}

        public double getDiscount(){ 
            double result = 0;
            double itemQuantity = getQuantity();
            String itemTitle = getTitle();
            System.out.println(itemTitle);
            if(itemQuantity == 1){result = 0;}
            if(itemQuantity > 1)
                if (itemTitle.equals("shirt") || itemTitle.equals("shirts")){
                    result = getSubTotal()/itemQuantity * getDiscountRate()*(itemQuantity - 1);
            }
            
            return result; 
	}
        
        public int getQuantity() { 
            int itemQuantity = 0;
            Enumeration items = itemList.elements();  	 	
            while (items.hasMoreElements()) {  	 	 	
                Item theNextItem = (Item)items.nextElement();
                itemQuantity += theNextItem.getItemQuantity(); 
            } 	 
        return itemQuantity; 
        }
        
        public String getTitle() { 
            String itemTitle = "";
            Enumeration items = itemList.elements();  	 	
            while (items.hasMoreElements()) {  	 	 	
                Item theNextItem = (Item)items.nextElement();
                itemTitle += theNextItem.getTitle(); 
            } 	 
        return itemTitle; 
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
