/* Write a Java program to generate the Fibonacci series up to 'n' 
numbers. */
import java.util.*;
{
    class Q1
    {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = scanner.nextInt();
        
        int a = 0, b = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        
        scanner.close();
    }
    }
}