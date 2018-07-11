/*
 * Rodi Murad
 * bank account class
 */
package account;

public class BankAccount {
    private double balance;

    public BankAccount(){
        balance = 0.0;
    }
    
    public void deposit(double amount){
        balance = balance + amount;
    }
    public void withdraw (double amount){
        balance = balance - amount;
    }
    public double getBalance(){
        return balance;
    }
    
}

          
