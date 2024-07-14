// 6. Car Class: Design a `Car` class with a constructor to set the car's make, model, and year of manufacture.

class Car{
    private String carModel;
    private long carPrice;
    private int carYear;

    public Car() {
        this.carModel ="";
        this.carPrice = 0;
        this.carYear = 0;
    }
    public Car(String carModel,long carPrice,int carYear) {
        this.carModel = carModel;
        this.carPrice = carPrice;
        this.carYear = carYear;
    }

    void displayCar() {
        System.out.println("Car Details");
        System.out.println("car Name : " + this.carModel);
        System.out.println("Car Price :" + this.carPrice);
        System.out.println("Car Manufacture Year :" + this.carYear);
    }
}

public class Task6 {
    public static void main(String []args) {
        Car c1 = new Car("cyber truck",1000000,2023);
        c1.displayCar();
    }    
}
