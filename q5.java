/*Write a Java program to find the largest element in a one-dimensional 
array. 
{25, 10, 55, 30}; */
import java.util.*;
{
    class Q5
    {
    public static void main(String[] args) {
        int[] arr = {25, 10, 55, 30}; 
        int largest = arr[0]; 
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; 
            }
        }
        
        System.out.println("Largest element: " + largest);
    }
    }
}