// 1. Single Inheritance Problem:
//    - Problem Statement: Implement a basic single inheritance hierarchy with two classes: 'Vehicle' (base class) and 'Car' (derived class). The 'Vehicle' class should have attributes like 'brand' and 'speed', and a method 'displayInfo()'. The 'Car' class should inherit from 'Vehicle', add an attribute 'model', and override the 'displayInfo()' method to include the 'model' information. Use constructors to initialize these attributes and utilize 'this' and 'super' keywords effectively.1. Single Inheritance Problem:

class Vehicle{
    private String carModel;
    private String carBrand;
    private int carMaxSpeed;

    public Vehicle() {
        this.carBrand = "";
        this.carModel = "";
        this.carMaxSpeed = 0;
    }
    public Vehicle(String carModel,String carBrand,int carMaxSpeed) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carMaxSpeed = carMaxSpeed;
    }
    
    void displayInfo() {
        System.out.println("Car Details");
        System.out.println("Car Model : " + this.carModel);
        System.out.println("Car Brand : " + this.carBrand);
        System.out.println("Car Max Speed : " + this.carMaxSpeed);
    }
}
class Car extends Vehicle{
    public Car() {}
    public Car(String carModel,String carBrand,int carMaxSpeed) {
        super(carModel,carBrand,carMaxSpeed);
    }
    void displayInfo() {
        super.displayInfo();
    }

}

public class Task1 {
    public static void main(String[] args) {
        Car c1 = new Car("alto 800", "maruti suzuki",120);
        c1.displayInfo();
    }
}