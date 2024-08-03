// 10. Using This and Super with Multiple Levels of Inheritance:
//     - Problem Statement: Create a multilevel inheritance hierarchy with classes 'Electronics', 'Computer', and 'Laptop'. The 'Electronics' class should have attributes 'brand' and 'price', and a method 'showDetails()'. The 'Computer' class should add 'processorType' and override 'showDetails()'. The 'Laptop' class should add 'batteryLife' and further override 'showDetails()'. Use constructors, 'this', and 'super' to demonstrate proper initialization and method calls.

class Electronics {
    private String brand;
    private double price;
    
    public Electronics(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void showDetails() {
        System.out.println("Brand : " + this.brand);
        System.out.println("Price : " + this.price);
    }
}
class Computers extends Electronics{
    private String processorType;

    public Computers (String brand, double price, String processorType) {
        super(brand, price);
        this.processorType = processorType;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Processor Type : " + this.processorType);
    }
}
class Laptops extends Computers {
    private int batteryLife;

    public Laptops (String brand, double price, String processorType, int batteryLife) {
        super(brand, price, processorType);
        this.batteryLife = batteryLife;
    }

    @Override
    public void showDetails() {
        System.out.println("-- About Laptop --");
        super.showDetails();
        System.out.println("Battery life : " + this.batteryLife + "Hrs");
    }
}

public class Task10 {
    public static void main(String [] args) {
        Laptops l1 = new Laptops("lenovo", 84000, "ryzen 7 5800h", 4);
        l1.showDetails();
    }   
}
