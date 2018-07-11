/*
 * Author: Rodi Murad
 * Title: sieve of Eratosthenes for finding prime numbers
 * class: CIT130
 * Assignment: 4/1
 * Date: 6/14/2015
 */
package eratosthenessieve;
import java.util.Scanner;

public class EratosthenesSieve {
    public static void main(String[] args) {
        
        //scanner keyboard input to get user's input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a value greater than 2 for search of prime numbers: ");
        int maxNumber = keyboard.nextInt();
        
        EratosthenesSieve sieve = new EratosthenesSieve();
        sieve.primes(maxNumber);
    }     
    
    //primes void class
    public void primes(int maxNumber)
    {
        //creating a primes boolean array with a length of input plus 1
        boolean[] primes = new boolean[maxNumber + 1];
        //for loop is used to make all values prime initially, so then they are crossed off
        for (int i = 2; i < primes.length; i++)
        {
            primes[i] = true;
        }
        
    int num = 2;
    while (true)
    {
        for (int i = 2;; i++)
        {
            //using the multiple of 2 criteria for the elimination of the values that are not primes
            int multiple = num * i;
            if(multiple > maxNumber)
            {
                break;
            }
            else
            {
                primes[multiple] = false;
            }
        }
        // declaring a found boolean as false
        boolean Found = false;
        
        //loop to find the primes and register in the primes array
        for (int i= num + 1; i < maxNumber + 1; i++)
        {
            if (primes[i])
            {
                num = i;
                Found = true;
                break;
            }
        }
        if (!Found)
        {
            break;
        }
    }
    
    // loop to write all the primes elements that were found
    for (int i = 0; i < primes.length; i++)
    {
        if (primes[i])
        {
            System.out.print(i + " ");
        }
    }  
}
}

