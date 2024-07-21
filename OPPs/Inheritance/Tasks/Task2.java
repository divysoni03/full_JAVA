// 2. Multilevel Inheritance Problem:
//    - Problem Statement: Create a multilevel inheritance structure with three classes: 'Animal' (base class), 'Mammal' (derived class), and 'Dog' (further derived class). The 'Animal' class should have an attribute 'species' and a method 'makeSound()'. The 'Mammal' class should add an attribute 'hasFur' and override 'makeSound()'. The 'Dog' class should add an attribute 'breed' and further override 'makeSound()' to specify the dog's sound. Use constructors to initialize attributes and ensure proper use of 'this' and 'super'.

class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }
    void makeSound() {
        System.out.println("Animal specie : " + this.species);
    }
}
class Mammal extends Animal{
    private boolean hasFur = false;
    public Mammal(String species, boolean hasFur) {
        super(species);
        this.hasFur = hasFur;
    }
    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Has Fur ? :" + this.hasFur);
    }
}
class Dog extends Mammal{
    private String breed;
    public Dog(String species, boolean hasFur, String breed) {
        super(species, hasFur);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Breed : " + this.breed + "\nsound : bark bark bark");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Dog d1 = new Dog("german", true, "idontkn");
        d1.makeSound();
    }
}
