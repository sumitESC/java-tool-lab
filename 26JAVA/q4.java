/*Write a Java program to demonstrate Abstraction using an abstract class. 
Create an abstract class named Animal with an abstract method sound(). 
Create two subclasses: 
 Dog class that extends Animal and implements the sound() method to display "Dog 
barks". 
 Cat class that extends Animal and implements the sound() method to display "Cat 
meows". 
Create a main class MainClass where objects of Dog and Cat are created, and their respective 
sound() methods are called to demonstrate abstraction.*/
import java.util.*;

abstract class Animal {
    abstract void sound();
}

// Dog subclass
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Cat subclass
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// main class for demonstration
public class q4 {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();

        d.sound();
        c.sound();
    }
}