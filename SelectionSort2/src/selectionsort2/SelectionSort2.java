/*
 * Author: Rodi Murad
 */
package selectionsort2;
import java.util.Scanner;

public class SelectionSort2 {

    public static void main(String[] args) {
        
        Integer[] numbers = {1, 3, 6, 9, 12, 5, 7, 2, 25, 15, 35};
        String input;
//        String Ascending = "A";
//        String Descending = "D";
        int swap = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the desired operation: ");
        input = keyboard.nextLine();
        
        if (keyboard.equals("A")){
            for (int i = 0; i < numbers.length - 1; i++){
                for (int j = 0; j < numbers.length; j++){
                    
                    System.out.println(numbers.length);
                    
                    if (numbers[j] > numbers[i + 1]){
                        swap = numbers[j];
                        numbers[j] = numbers[i + 1];
                        numbers[i + 1] = swap;
                        System.out.println("the new numbers layout is :" + numbers[i]);
                    }
                }
            }
        }
        else {
            //Descending sort class
        }
    }
    
}
