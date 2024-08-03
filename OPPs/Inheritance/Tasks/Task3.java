// 3. Hierarchical Inheritance Problem:
//    - Problem Statement: Implement a hierarchical inheritance setup with a base class 'Person' and two derived classes 'Student' and 'Teacher'. The 'Person' class should have attributes 'name' and 'age', and a method 'introduce()'. The 'Student' class should add an attribute 'grade', while the 'Teacher' class should add 'subject'. Both derived classes should override 'introduce()' to include their specific details. Utilize constructors and the 'super' keyword appropriately.

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void introduce() {
        System.out.println("Name :" + this.name);
        System.out.println("Age :" + this.age);
    }
}
class Student extends Person{
    private char grade;
    public Student (String name, int age, char grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void introduce() {
        System.out.println("-- About Student --");
        super.introduce();
        System.out.println("Student Grades : " + this.grade);
    }
}
class Teacher extends Person{
    private String subject;
    public Teacher (String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("-- About Teacher --");
        super.introduce();
        System.out.println("Teacher Subject :" + this.subject);
    }
}

public class Task3 {
    public static void main(String[] args) {
        Student divy = new Student("divy", 18, 'A');
        Teacher shrey = new Teacher("Shrey kedia", 21, "Java");

        divy.introduce();
        shrey.introduce();
    }    
}
