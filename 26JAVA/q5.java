/*Write a Java program to create an abstract class Appliance with an abstract method 
getPower (). Derive two classes Fan and WashingMachine from it and implement the 
getPower() method to return their power consumption.100, 1000*/
import java.util.*;

abstract class Appliance {
    abstract int getPower();
}

class Fan extends Appliance {
    @Override
    int getPower() {
        return 100; // watts
    }
}

class WashingMachine extends Appliance {
    @Override
    int getPower() {
        return 1000; // watts
    }
}

public class q5 {
    public static void main(String[] args) {
        Appliance fan = new Fan();
        Appliance wm = new WashingMachine();
        System.out.println("Fan power consumption: " + fan.getPower() + " watts");
        System.out.println("WashingMachine power consumption: " + wm.getPower() + " watts");
    }
}