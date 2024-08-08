// 1. Single Inheritance:
//    Create a Java program to model a simple vehicle hierarchy with a base class "Vehicle" and two derived classes "Car" and "Motorcycle."

class Vehicle{
    private String vehicleType;
    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public void showInfo() {
        System.out.println("Vehicle Type :" + this.vehicleType);
    }
}
class Car extends Vehicle{
    private String modelName;
    private double price;
    public Car(String vehicleType, String modelName, double price) {
        super(vehicleType);
        this.modelName = modelName;
        this.price = price;
    }

    @Override
    public void showInfo() {
        System.out.println("-- About Car --");
        super.showInfo();
        System.out.println("Model Name : " + this.modelName);
        System.out.println("Price : " + this.price);
    }
}
class Motorcycle extends Vehicle{
    private String modelName;
    private double price;

    public Motorcycle(String vehicleType, String modelName, double price) {
        super(vehicleType);
        this.modelName = modelName;
        this.price = price;
    }

    @Override
    public void showInfo() {
        System.out.println("-- About Motorcycle --");
        super.showInfo();
        System.out.println("Model Name : " + this.modelName);
        System.out.println("Price : " + this.price);
    }
}

public class Task1 {
    public static void main(String []args) {
        Car c1 = new Car("4 wheeler", "alto800", 200000);
        Motorcycle m1 = new Motorcycle("2 wheeler", "splender", 100000);

        c1.showInfo();
        m1.showInfo();
    }
}
