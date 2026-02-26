/*Write a Java program to demonstrate Abstraction using an abstract class. 
Create an abstract class named Shape that contains the following abstract methods: 
 draw() 
 area() 
 perimeter() 
Create a subclass Circle that extends the Shape class and provides implementation for all the 
abstract methods. Use a fixed radius value to calculate the area and perimeter of the circle. 
In the main class Maths, create an object of the Circle class and call the methods draw(), 
area(), and perimeter() to display the results.*/
import java.util.*;

abstract class Shape {
    abstract void draw();
    abstract double area();
    abstract double perimeter();
}

// subclass Circle providing concrete implementations
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// main class q3
public class q3 {
    public static void main(String[] args) {
        double fixedRadius = 5.0; // example radius
        Circle c = new Circle(fixedRadius);
        c.draw();
        System.out.printf("Area: %.2f\n", c.area());
        System.out.printf("Perimeter: %.2f\n", c.perimeter());
    }
}