// 2. Multilevel Inheritance:
//    Develop a Java application for a school management system where you have a base class "Person," a derived class "Student," and another class "Teacher" derived from "Student."

class Person{
    public void showInfo() {}
}
class Student extends Person{
    private String studentName;
    private int studentId;
    private float marks;
    public Student(String studentName, int studentId, float marks) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.marks = marks;
    }

    @Override
    public void showInfo() {
        System.out.println("-- Student Info --");
        System.out.println("Student Name :" + this.studentName);
        System.out.println("Student Id :" + this.studentId);
        System.out.println("Student Marks :" + this.marks);
    }
}
class Teacher extends Student{
    private String name;
    private int teacherId;
    private double salary;
    public Teacher(String studentName, int studentId, float marks, String name, int teacherId, double salary) {
        super(studentName, studentId, marks);
        this.name = name;
        this.teacherId = teacherId;
        this.salary = salary;
    }

    @Override
    public void showInfo() {
        System.out.println("-- About Teacher --");
        System.out.println("Teacher Name :" + this.name);
        System.out.println("Teacher Id :" + this.teacherId);
        System.out.println("Teacher Salary :" + this.salary);
        System.out.println("Student under this teacher -->");
        super.showInfo();
    }
}

public class Task2 {
    public static void main(String []args) {
        Teacher shrey = new Teacher("divy soni", 101, 90f, "Shrey K", 01, 125500);

        shrey.showInfo();
    }    
}
