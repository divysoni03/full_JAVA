// 4. Constructor Chaining with Single Inheritance:
//    - Problem Statement: Design a single inheritance relationship with classes 'Appliance' and 'WashingMachine'.

class Appliance {
    private String name;
    private double price;

    public Appliance(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void printDetails() {
        System.out.print("Appliance Details--> ");
        System.out.print("Appliance Name : " + this.name);
        System.out.print("Appliance Price : " + this.price);
    }
}

class WashingMachine extends Appliance {
    public WashingMachine(String name, double price) {
        super(name,price);
    }

    public void printDetails() {
        super.printDetails();
    }
}
public class Task4 {
    public static void main(String[] args) {
        WashingMachine w1 = new WashingMachine("Samsung", 10000);
        w1.printDetails();
    }    
}