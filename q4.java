/*Write a Java program to count the number of even and odd elements in an 
array. 
{1,2,3,4,5,6,7,7,7,7,9,1,9,9,13,24,26}*/
import java.util.*;
{
    class Q4
    {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,7,7,7,9,1,9,9,13,24,26}; 
        int evenCount = 0;
        int oddCount = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++; 
            } else {
                oddCount++; 
            }
        }
        
        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }
    }
}