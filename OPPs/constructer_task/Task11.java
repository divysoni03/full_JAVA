// 1. Basic Constructor Initialization:
//    Create a 'Person' class with fields for 'name' and 'age'. Implement a default constructor that sets these fields to default values and a parameterized constructor that initializes these fields with given values. Display the person's details using a method.

class Person {
    private String personName;
    private int personAge;

    public Person() {
        this.personName = "";
        this.personAge = 0;
    }
    public Person(String personName,int personAge) {
        this.personName = personName;
        this.personAge = personAge;
    }

    void displayPerson() {
        System.out.println("Person Details");
        System.out.println("Person Name :" + this.personName);
        System.out.println("Person Age : " + this.personAge);
    }
}

public class Task11 {
    public static void main(String[]args) {
        Person p1 = new Person("Divy",18);
        Person p2 = new Person("Shrey sir",21);

        p1.displayPerson();
        p2.displayPerson();
    }
}
