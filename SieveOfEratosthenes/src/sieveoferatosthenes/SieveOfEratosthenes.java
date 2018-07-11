/*
 * 
 */
package sieveoferatosthenes;
import java.util.Scanner;

public class SieveOfEratosthenes {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a value greater than 2 for search of prime numbers: ");
        int maxNumber = keyboard.nextInt();
        
        boolean[] primes = new boolean[maxNumber];
        
        //making all values in the boolean array primes to be true
        for (int i = 2; i < maxNumber; i++)
        {
            primes[i] = true;
        }
        
        int two = 2;
        while (true)
        {
            for (int j = 2;  ; j++)
            {
                int multipleOfTwo = two * j;
                if (multipleOfTwo > maxNumber)
                {
                    break;
                }
                else
                {
                    primes[multipleOfTwo] = false;
                }
            }
            boolean found = false;
            for (int k = two + 1; k < maxNumber + 1; k++)
            {
                if (primes[k])
                {
                    two = k;
                    found = true;
                    break;
                }
            }
            if (!found)
            {
                break;
            }
        }
            for (int l = 0; l < primes.length; l++)
            {
                if (primes[l])
                {
                   System.out.print(l + " "); 
                }
                
            }
    }
}
