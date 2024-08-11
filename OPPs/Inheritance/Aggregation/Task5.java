// 5. Single Inheritance:
//    Create a Java program for a simple geometric shapes hierarchy with a base class "Shape" and two derived classes "Circle" and "Rectangle."

class Shape{
    public void area() {}
    public void circumference() {}
}
class Circle extends Shape{
    private double radius;
    public Circle(double radius) {this.radius = radius;}

    @Override
    public void area() {
        System.out.println("Circle Area :" + (3.14*this.radius*this.radius));
    }
    @Override
    public void circumference() {
        System.out.println("Circle Circumference :" + (2*3.14*this.radius));
    }
}
class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        System.out.println("Rectangle Area :" + (this.length*this.width));
    }
    @Override
    public void circumference() {
        System.out.println("Rectangle Circumference :" + 2*(this.length+this.width));
    }
}

public class Task5 {
    public static void main(String []args) {
        Circle c = new Circle(40);
        c.area();
        c.circumference();

        Rectangle r = new Rectangle(20, 33);
        r.area();
        r.circumference();
    }
}
