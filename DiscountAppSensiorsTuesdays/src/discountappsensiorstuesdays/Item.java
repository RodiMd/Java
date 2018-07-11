/*
 * Assignment5
 * CSCI 717
 * 12/4/2017
 * Rodi Murad
 */
package discountappsensiorstuesdays;

public class Item {
    private String itemDayOfWeek = "";
    private static int programAreaInput = 0;
    private String itemTitle = "";
    private double itemPrice = 0.0;
    private double itemQuantity = 0.0;

    
    public Item(String dOWeek, int pAInput, String title, double price, double quantity){
        itemDayOfWeek = dOWeek;
        programAreaInput = pAInput;
        itemTitle = title;
        itemPrice = price;
        itemQuantity = quantity;

    }
    public void setDayOfWeek(String dOWeek){
            itemDayOfWeek = dOWeek;
        }
    public String getDayOfWeek(){
        return itemDayOfWeek;
    }
    public void setProgramAreaInput(int pAInput){
            programAreaInput = pAInput;
        }
    public int getProgramAreaInput(){
        return programAreaInput;
    }
    public void setTitle(String title){
        itemTitle = title;
    }
    public void setPrice(double price){
        itemPrice = price;
    }
    public void setQuantity(double quantity){
        itemQuantity = quantity;
    }
    public double getItemPrice(){
        return itemPrice;
    }
    public double getItemQuantity(){
        return itemQuantity;
    }
    public String getTitle(){
        return itemTitle;
    }
    public double getItemTotal(){
        return itemPrice * itemQuantity;
    }
}
