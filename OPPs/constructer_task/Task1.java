// 1. Person Class: Create a `Person` class with a parameterized constructor to store a person's name, age, and address.

class Person {
    private String personName;
    private String personAddress;
    private int personAge;

    public Person() {
        this.personName = "";
        this.personAge = 0;
        this.personAddress = "";
    }

    public Person(String personName, String personAddress, int personAge) {
        this.personName = personName;
        this.personAge = personAge;
        this.personAddress = personAddress;
    }

    void displayDetails() {
        System.out.println("Person's Details");
        System.out.println("Person Name: " + this.personName);
        System.out.println("Person Age: " + this.personAge);
        System.out.println("Person Address: " + this.personAddress);
    }
}

public class Task1 {
    public static void main(String[] args) {
        Person p1 = new Person("Shrey sir", "Manasa", 21);
        p1.displayDetails();
    }
}
