/*Write a Java program to demonstrate constructor overloading in a class named Employee. Create 
multiple constructors with different parameter lists such as no arguments, one argument, two 
arguments, and three arguments to initialize employee details like id, name, and salary. Display 
the details using a method.*/
public class Employee {
    int id;
    String name;
    double salary;

    // No-argument constructor
    Employee() {
        this.id = 0;
        this.name = "Unknown";
        this.salary = 0.0;
    }

    // Constructor with one argument
    Employee(int id) {
        this.id = id;
        this.name = "Unknown";
        this.salary = 0.0;
    }

    // Constructor with two arguments
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.salary = 0.0;
    }

    // Constructor with three arguments
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    // Main method to test constructor overloading
    public static void main(String[] args) {
        // Test no-argument constructor
        Employee emp1 = new Employee();
        System.out.println("Employee 1:");
        emp1.display();
        System.out.println();

        // Test constructor with one argument
        Employee emp2 = new Employee(101);
        System.out.println("Employee 2:");
        emp2.display();
        System.out.println();

        // Test constructor with two arguments
        Employee emp3 = new Employee(102, "John Doe");
        System.out.println("Employee 3:");
        emp3.display();
        System.out.println();

        // Test constructor with three arguments
        Employee emp4 = new Employee(103, "Jane Smith", 50000.0);
        System.out.println("Employee 4:");
        emp4.display();
    }
}