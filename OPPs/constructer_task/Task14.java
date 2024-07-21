// 14. Copy Constructor:
//    Create a 'Student' class with fields 'name', 'rollNumber', and 'grade'. Implement a copy constructor that initializes a new object as a copy of an existing 'Student' object. Also, provide a method to display the student's details.

class Student {
    private String studentName;
    private int studentRoll;
    private char studentGrade;

    public Student() {
        this.studentName = "";
        this.studentGrade = 'f';
        this.studentRoll = 0;
    }
    public Student(String studentName, char studentGrade, int studentRoll) {
        this.studentName = studentName;
        this.studentGrade = studentGrade;
        this.studentRoll = studentRoll;
    }
    public Student(Student s) {
        this.studentName = s.studentName;
        this.studentGrade = s.studentGrade;
        this.studentRoll = s.studentRoll;
    }

    void displayStudent() {
        System.out.println("Student Details, ");
        System.out.println("Student Name :" + this.studentName);
        System.out.println("Student RollNo :" + this.studentRoll);
        System.out.println("Student Grade :" + this.studentGrade);
    }
}

public class Task14 {
    public static void main(String[] args) {
        Student s1 = new Student("Divy",'A',107);
        Student s2 = new Student(s1);
        s1.displayStudent();
        s2.displayStudent();
    }
}
