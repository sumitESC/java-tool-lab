import java.util.*;

class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter product name: ");
        String productName = sc.nextLine();
        
        System.out.print("Enter product price: ");
        double price = sc.nextDouble();
        
        // Calculate discount using ternary operator
        double discount = (price > 2000) ? (price * 10 / 100) : (price * 7 / 100);
        double finalPrice = price - discount;
        
        System.out.println("\n--- Discount Details ---");
        System.out.println("Product Name: " + productName);
        System.out.println("Original Price: " + price);
        System.out.println("Discount Rate: " + ((price > 2000) ? "10%" : "7%"));
        System.out.println("Discount Amount: " + discount);
        System.out.println("Final Price: " + finalPrice);
    }
}
