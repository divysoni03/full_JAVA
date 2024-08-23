// 7. Hierarchical Inheritance:
//    Design a Java system for modeling different types of animals with a base class "Animal" and two derived classes "Mammal" and "Bird" to showcase hierarchical inheritance.
class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public void showInfo() {
        System.out.println("-- About Animal --");
        System.out.println("Animal name :" + this.name);
    }
}
class Mammal extends Animal{
    private boolean isMammal;
    public Mammal(String name, boolean isMammal) {
        super(name);
        this.isMammal = isMammal;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Is this Animal Mammal : " + (isMammal? "Yes" : "No"));
    }
}
class Bird extends Animal{
    private boolean isBird;
    public Bird(String name, boolean isBird) {
        super(name);
        this.isBird = isBird;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Is this Animal Bird :" + (isBird? "Yes" : "No"));
    }
}

public class Task7 {
    public static void main(String []args) {

    }
}
