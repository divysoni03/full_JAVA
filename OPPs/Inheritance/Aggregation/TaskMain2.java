/*

--> Problem Statement 2: Student Grades Aggregation

Context:
You are developing a system for a school to manage students' grades. Each student can be enrolled in multiple courses, and each course has multiple grades recorded for the student. Your task is to write a Java program that aggregates the grades data to provide insights such as total grades, average grade, and highest grade for each student.

Requirements:
1. Create a `Course` class that contains a list of `Grade` objects. Each `Grade` object should have attributes such as `date` (of type `LocalDate`) and `score` (of type `double`).
2. Write methods in the `Course` class to:
   - Calculate the total grades for the course.
   - Calculate the average grade for the course.
   - Find the highest grade for the course.
3. Create a `Student` class that contains a list of `Course` objects.
4. Write methods in the `Student` class to:
   - Calculate the total grades for the student across all courses.
   - Calculate the average grade for the student across all courses.
   - Find the course with the highest average grade.

Example Usage:

Course math = new Course();
math.addGrade(new Grade(LocalDate.of(2023, 1, 1), 90.0));
math.addGrade(new Grade(LocalDate.of(2023, 1, 2), 85.0));

Course science = new Course();
science.addGrade(new Grade(LocalDate.of(2023, 1, 1), 95.0));
science.addGrade(new Grade(LocalDate.of(2023, 1, 2), 80.0));

Student student = new Student();
student.addCourse(math);
student.addCourse(science);

System.out.println("Total grades for the student: " + student.getTotalGrades());
System.out.println("Average grade for the student: " + student.getAverageGrade());
System.out.println("Course with the highest average grade: " + student.getTopCourse().getAverageGrade());



*/
import java.time.LocalDate;
import java.util.Scanner;

class Grade {
    private LocalDate date;
    private double score;

    public Grade(LocalDate date, double score) {
        this.date = date;
        this.score = score;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getScore() {
        return score;
    }
}

class Course {
    private Grade[] grades;
    private int gradeCount;

    public Course(int maxGrades) {
        grades = new Grade[maxGrades];
        gradeCount = 0;
    }

    public void addGrade(Grade grade) {
        if (gradeCount < grades.length) {
            grades[gradeCount++] = grade;
        } else {
            System.out.println("Cannot add more grades to this course.");
        }
    }

    public double getTotalGrades() {
        double total = 0;
        for (int i = 0; i < gradeCount; i++) {
            total += grades[i].getScore();
        }
        return total;
    }

    public double getAverageGrade() {
        return gradeCount == 0 ? 0 : getTotalGrades() / gradeCount;
    }

    public double getHighestGrade() {
        double highest = grades[0].getScore();
        for (int i = 1; i < gradeCount; i++) {
            if (grades[i].getScore() > highest) {
                highest = grades[i].getScore();
            }
        }
        return highest;
    }
}

class Student {
    private Course[] courses;
    private int courseCount;

    public Student(int maxCourses) {
        courses = new Course[maxCourses];
        courseCount = 0;
    }

    public void addCourse(Course course) {
        if (courseCount < courses.length) {
            courses[courseCount++] = course;
        } else {
            System.out.println("Cannot add more courses to this student.");
        }
    }

    public double getTotalGrades() {
        double total = 0;
        for (int i = 0; i < courseCount; i++) {
            total += courses[i].getTotalGrades();
        }
        return total;
    }

    public double getAverageGrade() {
        if (courseCount == 0) return 0;
        double totalGrades = 0;
        int totalGradesCount = 0;
        for (int i = 0; i < courseCount; i++) {
            totalGrades += courses[i].getTotalGrades();
            totalGradesCount += courses[i].getAverageGrade() != 0 ? 1 : 0;
        }
        return totalGrades / totalGradesCount;
    }

    public Course getTopCourse() {
        if (courseCount == 0) return null;
        Course topCourse = courses[0];
        for (int i = 1; i < courseCount; i++) {
            if (courses[i].getAverageGrade() > topCourse.getAverageGrade()) {
                topCourse = courses[i];
            }
        }
        return topCourse;
    }
}

public class TaskMain2 {
    public static void main(String[] args) {
        // Example usage:
        Course math = new Course(5);
        math.addGrade(new Grade(LocalDate.of(2023, 1, 1), 90.0));
        math.addGrade(new Grade(LocalDate.of(2023, 1, 2), 85.0));

        Course science = new Course(5);
        science.addGrade(new Grade(LocalDate.of(2023, 1, 1), 95.0));
        science.addGrade(new Grade(LocalDate.of(2023, 1, 2), 80.0));

        Student student = new Student(5);
        student.addCourse(math);
        student.addCourse(science);

        System.out.println("Total grades for the student: " + student.getTotalGrades());
        System.out.println("Average grade for the student: " + student.getAverageGrade());

        Course topCourse = student.getTopCourse();
        if (topCourse != null) {
            System.out.println("Course with the highest average grade: " + topCourse.getAverageGrade());
        }
    }
}
    