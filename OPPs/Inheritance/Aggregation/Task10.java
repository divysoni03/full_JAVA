// 10. Multilevel Inheritance:
//     Develop a Java application for a vehicle rental system, with a base class "Vehicle," a derived class "Car," and another class "LuxuryCar" derived from "Car" to demonstrate multilevel inheritance.

import javax.swing.tree.VariableHeightLayoutCache;

class Vehicle {
    private String name;
    private double price;
    private boolean isAvailable;
    public Vehicle(String name, double price) {
        this.name = name;
        this.price = price;
        this.isAvailable = false;
    }

    public void showInfo() {
        System.out.println("-- About Vehicle --");
        System.out.println("Vehicle Name : " + this.name);
        System.out.println("Vehicle Price : " + this.price);
        System.out.println("Vehicle availability : " + (this.isAvailable? "Yes":"No"));
    }
}
class Car extends Vehicle{ 
    private String model;
    public Car(String name, double price, String model) {
        super(name, price);
        this.model = model;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Vehicle Model : " + this.model);
    }
}
class LuxuryCar extends Vehicle{
    private String model;
    public LuxuryCar(String name, double price, String model) {
        super(name, price);
        this.model = model;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Vehicle Model : " + this.model);
    }
}

public class Task10 {
    public static void main(String []args) {

    }    
}
