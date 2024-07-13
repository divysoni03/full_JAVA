// 3. Rectangle Class: Implement a `Rectangle` class with constructors for its width and height, and include methods to calculate its area and perimeter.

class Rectangle{
    private int width;
    private int height;

    //constructors
    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle (Rectangle r) {
        this.width = r.width;
        this.width = r.height;
    }

    //methods
    int rectangleArea() {
        return (this.width*this.height);
    }
    int rectanglePerimeter() {
        return (2*(this.width + this.height));
    }
}

public class Task3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(20,30);
        Rectangle r3 = new Rectangle(r2);

        System.out.println("Area of Rectangles r1 : " + r1.rectangleArea());
        System.out.println("Area of Rectangles r2 : " + r2.rectangleArea());
        System.out.println("Area of Rectangles r3 : " + r3.rectangleArea());
        
        System.out.println("Perimeter of Rectangles r1 : " + r1.rectangleArea());
        System.out.println("Perimeter of Rectangles r2 : " + r2.rectangleArea());
        System.out.println("Perimeter of Rectangles r3 : " + r3.rectangleArea());
    }
}
