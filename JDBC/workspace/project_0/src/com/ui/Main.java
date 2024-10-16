package com.ui;

import com.model.CarModel;
import com.service.CarService; // importing the service

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static CarService service = new CarService();
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		int choice = 0;
		
		do {
			System.out.println("--------------------------------");
			System.out.println("    Welcome to Car Dealership   ");
			System.out.println("--------------------------------");
			
			System.out.println("1. Add new car details");
			System.out.println("2. Get all cars details");
			System.out.println("3. Modify car details");
			System.out.println("4. Delete car details");
			System.out.println("0. Exit");
			System.out.print("\nChoose your option: ");
			choice = sc.nextInt();
			
			switch (choice) {
				case 1:
					addNewCar(sc);
					break;
				case 2:
					getCars();
					break;
				case 3:
					updateCar();
					break;
				case 4:
					deleteCar();
					break;
				case 5:
					getCarById();
					break;
				case 0:
					System.out.println("Exiting program...");
					break;
				default:
					System.out.println("Invalid Choice! Please enter a number between 1 to 5.");
					break;
			}
			
		}
		while(choice != 0);
	}
		
	public static void addNewCar(Scanner sc) {
		
		sc.nextLine();
		System.out.println("Enter Make :");
		String make = sc.nextLine();
		System.out.println("Enter Model :");
		String model = sc.nextLine();
		System.out.println("Enter Year :");
		int year = sc.nextInt();
		System.out.println("Enter Price :");
		double price = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Color :");
		String color = sc.nextLine();
		
		service.addCar(make, model, year, price, color); // passing the values
	}
	
	public static void getCars() {
		ArrayList<CarModel> cars = (ArrayList<CarModel>) service.getAllCars();
		
		System.out.println("| id | make | Model | Year | Price | Color |\n");
		for (CarModel c : cars) {
			System.out.println("| "+c.getId()+" | "+c.getMake()+" | "+c.getModel()+" | "+c.getYear()+" | "+c.getPrice()+" | "+c.getColor()+" |");			
		}
	}
	
	public static void updateCar() {
		System.out.print("Enter id To update the car : ");
		int id = sc.nextInt();
		
		CarModel car = service.getCarById(id);
		
		if(car == null) {
			System.out.println("Error Car not found.");
			return;
		}
		
		sc.nextLine();
		System.out.println("Enter make ('-' to skip): ");
		String make = sc.nextLine();
		System.out.println("Enter model ('-' to skip): ");
		String model = sc.nextLine();
		System.out.println("Enter year (0 to skip): ");
		int year = sc.nextInt();
		System.out.println("Enter price (0 to skip): ");
		double price = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter color ('-' to skip): ");
		String color = sc.nextLine();
		
		car.setMake(!make.equals("-") ? make : car.getMake());
		car.setModel(!model.equals("-") ? model : car.getModel());
		car.setYear( year != 0 ? year : car.getYear());
		car.setPrice(price != 0 ? price : car.getPrice());
		car.setColor(!color.equals("-") ? color : car.getColor());
		
		service.updateCar(car);
	}
	
	public static void deleteCar() {
		System.out.print("Enter Car Id to be delete : ");
		int car_id = sc.nextInt();
		
		service.deleteCarById(car_id);
	}
	
	public static void getCarById() {
		System.out.println("Enter Id to get the car : ");
		int car_id = sc.nextInt();
		
		CarModel car = service.getCarById(car_id);
		
		System.out.println("-----------------Car-----------------");
		System.out.println("Car Id : " + car.getId());
		System.out.println("Car Make : " + car.getMake());
		System.out.println("Car Model : " + car.getModel());
		System.out.println("Car Year : " + car.getYear());
		System.out.println("Car Price : " + car.getPrice());
		System.out.println("Car Color : " + car.getPrice());
	}
}
