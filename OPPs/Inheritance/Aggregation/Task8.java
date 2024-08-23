// 9. Single Inheritance:
//    Create a Java program to model a musical instrument hierarchy with a base class "Instrument" and two derived classes "Guitar" and "Piano."

class Instrument {
    private String Name;
    private double price;

    public Instrument(String Name, double price) {
        this.Name = Name;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("-- About Instrument --");
        System.out.println("Instrument Name : " + this.Name);
        System.out.println("Instrument price : " + this.price);
    }
}
class Guitar extends Instrument{
    private int numOfString;
    public Guitar(String Name, double price, int numOfString) {
        super(Name, price);
        this.numOfString = numOfString;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Guitar Strings : " + this.numOfString);
    }
}
class Piano extends Instrument{
    private int numOfKeys;
    public Piano(String Name, double price, int numOfKeys) {
        super(Name, price);
        this.numOfKeys = numOfKeys;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Piano keys : " + this.numOfKeys);
    }
}
public class Task8 {
    public static void main(String []args) {

    }    
}
