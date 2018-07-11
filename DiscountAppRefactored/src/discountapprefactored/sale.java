/*
 * Assignment5
 * CSCI 717
 * 12/4/2017
 * Rodi Murad
 */
package discountapprefactored;
import java.util.*;

public class sale {
    //invariants, discounts
    private static double DISCOUNT_RATE = 0.05;
    private static double SENIOR_DISCOUNT_RATE = 0.1;
    private static double PREFERRED_CUST_DISCOUNT_RATE = 0.15;
    
        private Vector itemList = new Vector();
        
        public void addItem(Item item) { 
            itemList.addElement(item);
        } 
                
        public double getDiscountRate(){ 
            return DISCOUNT_RATE; 
	}
        
        public double getSeniorDiscountRate(){
            return SENIOR_DISCOUNT_RATE;
        }
        
        public double getPreferredCustDiscountRate(){
            return PREFERRED_CUST_DISCOUNT_RATE;
        }
        //precondition dOWeek = tu & programAreaInput = 1
        //postcondition result = senior discount
        public double getDiscount(){ 
            double result = 0;
            int programAreaInput = getProgramArea();
            String dOWeek = getDayOfWeek();
            
            //precondition, programAreaInput = 0
            //postcondition, result = price * 5%
            if(programAreaInput == 0){result = getSubTotal()*getDiscountRate();}
            
            //precondition, dOWeek != tu and programAreaInput = 1
            //postcondition, result = price * 5%
            if(programAreaInput == 1 && !dOWeek.equals("tu")
                    && !dOWeek.equals("TU") && !dOWeek.equals("Tu")&&
                    !dOWeek.equals("tU"))
                    {result = getSubTotal()*getDiscountRate();
            //precondition, dOWeek = tu and programAreaInput = 1
            //postcondition, result = price * 10% - senior discount
            }else if (programAreaInput == 1){
                result = getSubTotal() * getSeniorDiscountRate();
            }
            //precondition programAreaInput = 2
            //postcondition, result = price * 15% - preferred customer discount
            if (programAreaInput == 2){result = getSubTotal() * getPreferredCustDiscountRate();}

            return result; 
	}
        
        public String getDayOfWeek(){
            String itemDayOfWeek = "";
            Enumeration items = itemList.elements();  	 	
            while (items.hasMoreElements()) {  	 	 	
                Item theNextItem = (Item)items.nextElement();
                itemDayOfWeek += theNextItem.getDayOfWeek(); 
            } 	 
        return itemDayOfWeek; 
        }
        
        public int getProgramArea() { 
            int programAreaInput = 0;
            Enumeration items = itemList.elements();  	 	
            while (items.hasMoreElements()) {  	 	 	
                Item theNextItem = (Item)items.nextElement();
                programAreaInput += theNextItem.getProgramAreaInput(); 
            } 	 
        return programAreaInput; 
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
