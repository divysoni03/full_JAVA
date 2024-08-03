// 6. Using Super to Call Parent Class Methods:
//    - Problem Statement: Implement a hierarchical inheritance system with classes 'Shape', 'Circle', and 'Rectangle'. The 'Shape' class should have a method 'area()'. Both 'Circle' and 'Rectangle' classes should override the 'area()' method. Ensure 'Circle' and 'Rectangle' call the 'area()' method from 'Shape' using 'super' and then add their specific calculations.

class Shape {
    public Shape() {}
    public void area() {}
}
class Circle extends Shape{
    private float radius;
    public Circle (float radius) {
        super();
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Area of circle :" + (3.14*radius*radius));
    }
}
class Rectangle extends Shape{
    private float length;
    private float width;

    public Rectangle (float length, float width) {
        super();
        this.length = length;
        this.width = width;
    }

    @Override
    public void area () {
        System.out.println("Area of Rectangle :" + (length*width));
    }
}   

public class Task6 {
    public static void main(String[] args) {
        Circle c1 = new Circle(12.5f);
        Rectangle r1 = new Rectangle(12.4f,15.9f);

        c1.area();
        r1.area();
    }
}
