/*
 * Author: Rodi Murad
 * Class: CIT130
 * Assignment: 10
 * Title: Generic Binary Search
 * Date: 7/21/2015
 */
package binarysearch;

public class gbSearch{
    
    public static <T extends Comparable<T>> int Search(T[] a, int first, int last, T key){
        
        first = 0;
        last = a.length - 1;
        int position = -1;
        int middle = 0;
        boolean found = false;
        
        while (!found && first <= last){
            //get the middle value
            middle = (first + last) / 2;
            
            //consition to check if the middle value equals the input value
            //if true then the position of the found item takes the value of the middle
            if (a[middle].equals((key))){
                found = true;
                position = middle;   
            }
            //condition to check if the comparison is positive, if yes then
            //last will take a smaller value than the middle
            else if (a[middle].compareTo(key) > 0){
                last = middle - 1;
            }
            //if the comparisson is negative then the first takes the value of
            //one larger than the middle
            else{
                first = middle + 1;
            }
        }
        return position;
    }

}
