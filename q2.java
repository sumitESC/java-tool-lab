/*Write a Java program to find the average of elements in a one-dimensional 
array. 
{10, 20, 30, 40, 50};*/
import java.util.*;
{
    class Q2
    {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; 
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; 
        }
        
        double average = (double) sum / arr.length; 
        
        System.out.println("Average: " + average);
    }
    }
} 