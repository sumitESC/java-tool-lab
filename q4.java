/*Write a Java program to accept n numbers from command line 
Arguments, store them in an array, and find the second largest 
number. */
import java.util.*;
{
    class Q4
    {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide at least two numbers as command-line arguments.");
            return;
        }
        
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number.");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }
    }
}