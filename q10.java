/* Make the String To UpperCase 
united college of engineering and technology" */
import java.util.*;
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        
        // Convert the string to uppercase
        String upperCaseString = inputString.toUpperCase();
        
        System.out.println("Uppercase String: " + upperCaseString);
    }
}