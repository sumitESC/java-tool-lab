/*Write a Java program to demonstrate the use of a constructor. 
Create a class named Employee with the following attributes: 
 empID 
 empName 
 empDesignation 
Define a parameterized constructor to initialize these attributes. 
Create a method named display() to print the employee details. 
In the main() method, create three Employee objects with different values and display their 
details using the display() method.*/
import java.util.*;
public class Employee {
    int empID;
    String empName;
    String empDesignation;


    Employee(int id, String name, String designation) {
        this.empID = id;
        this.empName = name;
        this.empDesignation = designation;
    }

    void display() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Designation: " + empDesignation);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Ravi Kumar", "Software Engineer");
        Employee emp2 = new Employee(102, "Priya Singh", "Project Manager");
        Employee emp3 = new Employee(103, "Amit Patel", "Developer");

        emp1.display();
        emp2.display();
        emp3.display();
    }
}