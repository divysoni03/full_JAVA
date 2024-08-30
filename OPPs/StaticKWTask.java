/*Task:

Problem Statement: Car Fleet Management

You are tasked with developing a car fleet management system. The system needs to keep track of various pieces of information for each car in the fleet, such as the make, model, year, price, and whether the car is currently in use. Additionally, the system should maintain a count of the total number of cars in the fleet.

Design and implement a `Car` class to represent individual cars in the fleet. The `Car` class should have the following features:

- Attributes:
  - `make` (String): The make or brand of the car.
  - `model` (String): The model of the car.
  - `year` (int): The manufacturing year of the car.
  - `price` (double): The price of the car.
  - `isRunning` (boolean): A flag indicating whether the car is currently running or not.

- Static Attribute:
  - `numberOfCars` (int): A static variable to keep track of the total number of cars in the fleet.

- Methods:
  - A constructor to initialize the car's attributes.
  - `start()` and `stop()` methods to change the `isRunning` status.
  - `displayCarInfo()` method to display car information.
  - A `getNumberOfCars()` static method to retrieve the total number of cars in the fleet.

You need to implement the `Car` class and use it to create, manage, and display information for multiple cars in the fleet. Ensure that the `numberOfCars` variable is properly incremented when new cars are added to the fleet and that it can be accessed without creating an instance of the `Car` class.
 */

 import java.util.Scanner;

 class Car {
     private String brand;
     private String model;
     private int year;
     private double price;
     private boolean isRunning;
     private static int numOfCars;
 
     static {
         numOfCars = 0;
     }
 
     public Car() {
         this.isRunning = false;
         numOfCars++;
     }
 
     public Car(String brand, String model, int year, double price) {
         this.brand = brand;
         this.model = model;
         this.year = year;
         this.price = price;
         this.isRunning = false;
         numOfCars++;
     }
 
     public void start() {
         if (isRunning) {
             System.out.println("Car is already running. Try stopping it.");
         } else {
             System.out.println("Starting the car...");
             this.isRunning = true;
         }
     }
 
     public void stop() {
         if (!isRunning) {
             System.out.println("Car is already stopped. Try starting it.");
         } else {
             System.out.println("Stopping the car...");
             this.isRunning = false;
         }
     }
 
     public static int getNumOfCars() {
         return numOfCars;
     }
 
     public String getBrand() {
         return this.brand;
     }
 
     public String getModel() {
         return this.model;
     }
 
     public void getCarInfo() {
         System.out.println("-- About Car --");
         System.out.println("Car Brand: " + this.brand);
         System.out.println("Car Model: " + this.model);
         System.out.println("Car Year: " + this.year);
         System.out.println("Car Price: " + this.price);
         System.out.println("Car Status: " + (isRunning ? "Running" : "Not Running"));
     }
 }
 
 class Fleet {
     private Car[] cars;
     private int carCount;
 
     public Fleet(int maxCars) {
         this.cars = new Car[maxCars];
         this.carCount = 0;
     }
 
     public void addCar(Car c) {
         if (carCount >= cars.length) {
             System.out.println("You reached the max cars limit, can't add more.");
         } else {
             cars[carCount++] = c;
             System.out.println("Car added successfully.");
         }
     }
 
     public void getCarInfo() {
         for (int i = 0; i < carCount; i++) {
             cars[i].getCarInfo();
             System.out.println("\n");
         }
     }
 
     public int getNumberOfCars() {
         return Car.getNumOfCars();
     }
 
     public void start(Scanner sc) {
         System.out.print("Enter car brand or model to start: ");
         String tempCarName = sc.nextLine();
         for (int i = 0; i < carCount; i++) {
             if (cars[i].getBrand().equals(tempCarName) || cars[i].getModel().equals(tempCarName)) {
                 System.out.println("Car found...");
                 cars[i].getCarInfo();
                 cars[i].start();
                 return;
             }
         }
         System.out.println("Can't find the car. Please check the entered name and try again.");
     }
 
     public void stop(Scanner sc) {
         System.out.print("Enter car brand or model to stop: ");
         String tempCarName = sc.nextLine();
         for (int i = 0; i < carCount; i++) {
             if (cars[i].getBrand().equals(tempCarName) || cars[i].getModel().equals(tempCarName)) {
                 System.out.println("Car found...");
                 cars[i].getCarInfo();
                 cars[i].stop();
                 return;
             }
         }
         System.out.println("Can't find the car. Please check the entered name and try again.");
     }
 }
 
 public class StaticKWTask {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Fleet myFleet = new Fleet(5);
 
         Car c1 = new Car("Maruti Suzuki", "Alto 800", 2023, 200000);
         myFleet.addCar(c1);
 
         myFleet.getCarInfo();
         myFleet.start(sc);
         myFleet.stop(sc);
     }
 }
 