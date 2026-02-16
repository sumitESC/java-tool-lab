import java.util.*;

class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        
        // Using ternary operator: (condition) ? value_if_true : value_if_false
        String result = (marks > 40) ? "Pass" : "Fail";
        
        System.out.println("Result: " + result);
    }
}