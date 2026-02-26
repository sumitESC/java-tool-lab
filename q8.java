/*Write a Java program to print the elements of an array in reverse order. 
{1, 2, 3,4,5,6,7} */
import java.util.*;
{
    class Q6
    {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7}; 
        
        System.out.println("Elements of the array in reverse order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]); 
        }
    }
    }
}