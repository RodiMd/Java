/*
 * deep clone of bank account class
 */
package account;

public class BankAccountClone implements Cloneable{
    
    BankAccount customer = new BankAccount();
    
    @Override
    public Object clone() throws CloneNotSupportedException{
 
        BankAccountClone customerClone = (BankAccountClone)super.clone();
        customerClone.customer = new BankAccount();
        
       return customerClone;
    }
    
}

