/* Write a Java program to compute the factorial of a number 
using command-line arguments. */
import java.util.*;
{
    class Q3
    {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }
        
        int number = Integer.parseInt(args[0]);
        long factorial = 1;
        
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
    }
}