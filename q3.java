/* Write a Java program to copy elements from one array to another array 
and display the copied array. 
{1, 2, 3} */
import java.util.*;
{
    class Q3
    {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3}; 
        int[] copiedArray = new int[sourceArray.length]; 
        
        for (int i = 0; i < sourceArray.length; i++) {
            copiedArray[i] = sourceArray[i]; 
        }
        
        System.out.println("Copied Array:");
        for (int i = 0; i < copiedArray.length; i++) {
            System.out.println(copiedArray[i]); 
        }
    }
    }
}