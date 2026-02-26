/*Write a Java program to create a class Rectangle that calculates area using a constructor.*/

class Rectangle {
    double length;
    double width;
    
    // Constructor to initialize rectangle dimensions
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Method to calculate area
    double calculateArea() {
        return length * width;
    }
    
    // Method to display rectangle info
    void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
    }
}

public class q6 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 4.0);
        rect.display();
    }
}