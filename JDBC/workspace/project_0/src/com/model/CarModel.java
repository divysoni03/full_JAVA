// car model makes the car object and passes through and then the car service will send it to
// database.

package com.model;

public class CarModel {
	private int id;
	private String make;
	private String model;
	private int year;
	private double price;
	private String color;
	
	public CarModel() {}
	
	public CarModel(int id, String make, String model, int year, double price, String color) {
		this.id = id;
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.color = color;
	}
	
	// making this constructor because the id is on auto increment
	public CarModel(String make, String model, int year, double price, String color) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "CarModel [id=" + id + ", make=" + make + ", model=" + model + ", year=" + year + ", price=" + price
				+ ", color=" + color + "]";
	}
}
