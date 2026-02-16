import java.util.*;

class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Using ternary operator to check if positive or negative
        String Result = (number > 0) ? "Positive number" : "Negative number";
        
        System.out.println("Result: " + Result);
    }
}
