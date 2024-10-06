package com.ui;

import com.service.CarService; // importing the service

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
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
		CarService service = new CarService(); // making new service object so we can pass the car data
		
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
	
}
