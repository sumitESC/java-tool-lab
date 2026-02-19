/* Check the any string is palindrome or not take the input from user. 
Check the word “MADAM” & “DALDA” */
import java.util.Scanner;
class q9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        String cleanedStr = str.replaceAll("\\s+", "").toUpperCase();
        
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        
        if (cleanedStr.equals(reversedStr)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}