// 8. Overloading Constructors in Multilevel Inheritance:
//    - Problem Statement: Design a multilevel inheritance structure with classes 'Gadget', 'Phone', and 'Smartphone'. Each class should have multiple constructors to initialize different sets of attributes. Ensure constructor overloading and chaining using 'this' and 'super' keywords.

class Gadget{
    private String typeName;
    public Gadget(String typeName) {
        this.typeName = typeName;
    }

    void showInfo() {
        System.out.println("Type of Gadget : " + this.typeName);
    }
}
class Phone extends Gadget{
    private String phoneType;
    public Phone(String typeName,String phoneType) {
        super(typeName);
        this.phoneType = phoneType;
    }

    void showInfo() {
        super.showInfo();
        System.out.println("Phone Type : " + this.phoneType);
    }
}
class Smartphone extends Phone{
    private String modelName;
    private double price;
    public Smartphone(String typeName, String phoneType,String modelName, double price) {
        super(typeName, phoneType);
        this.modelName = modelName;
        this.price = price;
    }

    void showInfo() {
        super.showInfo();
        System.out.println("Model Name : " + this.modelName);
        System.out.println("Price : " + this.price);
    }
}

public class Task8 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("Mobile phone", "Smart-Phone", "Oneplus 11r", 20000);

        s1.showInfo();
    }
}
