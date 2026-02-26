/*Write a Java program to demonstrate Constructor Overloading. 
Create a class named studentover with the following data members: 
 id 
 name 
Define three constructors in the same class: 
1. A no-argument constructor that initializes id to 0 and name to "Unknown". 
2. A constructor that takes one parameter (id) and sets the name to "Not Assigned". 
3. A constructor that takes two parameters (id and name) and initializes both variables. 
Create a method display() to print the student details. 
In the main() method, create three objects using different constructors and display their values 
to show constructor overloading.*/
import java.util.*;
public class q2 {
    int id;
    String name;

    // No-argument constructor
    q2() {
        this.id = 0;
        this.name = "Unknown";
    }

    // Constructor with one parameter
    q2(int id) {
        this.id = id;
        this.name = "Not Assigned";
    }

    // Constructor with two parameters
    q2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println();
    }

    public static void main(String[] args) {
        q2 student1 = new q2();
        q2 student2 = new q2(101);
        q2 student3 = new q2(102, "Alice");

        System.out.println("--- Student 1 Details ---");
        student1.display();

        System.out.println("--- Student 2 Details ---");
        student2.display();

        System.out.println("--- Student 3 Details ---");
        student3.display();
    }
}