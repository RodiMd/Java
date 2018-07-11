/*
 * Assignment5
 * CSCI 717
 * 12/4/2017
 * Rodi Murad
 */
package discountappbogo;

public class Item {

    private String itemTitle = "";
    private double itemPrice = 0.0;
    private double itemQuantity = 0.0;

    
    public Item(String title, double price, double quantity){

        itemTitle = title;
        itemPrice = price;
        itemQuantity = quantity;
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
