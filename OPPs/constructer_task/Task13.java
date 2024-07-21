// 13. Constructor Chaining:
//    Implement a 'Rectangle' class with fields for 'length' and 'width'. Provide a default constructor that initializes these to 1, another constructor that takes only 'length' (and sets 'width' to a default value), and a constructor that takes both 'length' and 'width'. Use constructor chaining to avoid code duplication.

class Rectangle {
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Constructor with only length specified
    public Rectangle(double length) {
        this();
        this.length = length;
    }

    // Constructor with only width specified
    // Using a different parameter name to avoid conflict with the length constructor
    public Rectangle(double width, boolean isWidth) {
        this();
        if (isWidth) {
            this.width = width;
        } else {
            this.length = width;
        }
    }

    // Constructor with both length and width specified
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void displayArea() {
        System.out.println("Area : " + this.length*this.width);
    }
}


public class Task13 {
    public static void main(String [] args) {
        Rectangle r1 = new Rectangle(12,12);
        // Rectangle r1 = new Rectangle(12,true);
        // Rectangle r1 = new Rectangle(12;
        r1.displayArea();
    }
}
