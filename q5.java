/*. Object-Oriented Programming Experiments 
Create a Java class Employee with attributes  
empID, 
empName,  
empDesignation. Initialize these attributes 
using a constructor and create three instances. Display their details.*/
import java.util.*;
{
    
    class Employee {
        int empID;
        String empName;
        String empDesignation;

        Employee(int id, String name, String designation) {
            this.empID = id;
            this.empName = name;
            this.empDesignation = designation;
        }

        void displayDetails() {
            System.out.println("Employee ID: " + empID);
            System.out.println("Employee Name: " + empName);
            System.out.println("Employee Designation: " + empDesignation);
            System.out.println();
        }
    }