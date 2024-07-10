class Car {
    private String brand, model;
    private int manufacturingYear;

    public Car() {
        brand = model = null;
        manufacturingYear = 0;
    }

    public Car(String brand, String model, int manufacturingYear) {
        this.brand = brand;
        this.model = model;
        this.manufacturingYear = manufacturingYear;
    }

    public Car(Car obj) {   //kind of copy constructor
        this.brand = obj.brand;
        this.model = obj.model;
        this.manufacturingYear = obj.manufacturingYear;
    }

    void getCarDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Manufacturing year: " + manufacturingYear);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Maruti", "Alto", 2000);
        Car c3 = new Car(c2);

        c1.getCarDetails();
        c2.getCarDetails();
        c3.getCarDetails();
    }
}

/*
Constructor: They are special method which automatically invokes when an object is created.
> Constructor name must be same as class name.
> Constructor must have no explicit return type.

2 types of constructor:
1. Default constructor: It is a constructor which has no parameter.
2. Parameterized constructor: It is a constructor which has parameter.

The constructors are used to initialize the object.

*/