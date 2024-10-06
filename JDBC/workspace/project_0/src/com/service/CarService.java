package com.service;

import com.dao.CarDao;
import com.model.CarModel;

public class CarService {
	private CarModel car = null; // making car object
	private CarDao carDao = null;
	
	
	// we will get this details from the main function 
	
	// we are making two functions of addCar() so the cardao 's addcar() function will remain abstract
	public void addCar(String make, String model, int year, double price, String color) {
		
		car = new CarModel(make, model, year, price, color);
		carDao = new CarDao(); // making the car Database access object
		
		carDao.addCar(car); // now we are just passing the car and the DAO(database access object) will connect to the database and push the new car into the database
	}
}
