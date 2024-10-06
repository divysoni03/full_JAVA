// DAO - database access object will connect to database to communicate with it.
package com.dao;

import com.util.DBconn; // for making the connection or communication with database

import com.model.CarModel; // importing the car model / object so we can use the data to add into the database

import java.sql.Connection; // for using connection and making connection

import java.sql.PreparedStatement; // for making prepared statements so no one can use SQL injections

public class CarDao {
	private Connection conn = null; // storing connection
	private PreparedStatement pstmt = null; // for making statement query
	
	public void addCar(CarModel car) { // this method will add car to the database
		// making this query and putting question marks so we can add values directly
		/*
		 * String Query = "INSERT INTO Luxurycars (make, model, year, price, color) VALUES ("+ value +", ?, ?, ?, ?)";
		 * as from above we can see that we can add values like that but the SQL injection command will get access to the database to anyone
		 * so we will use prepared statement and add values after preparing the statement so SQL injection can't be performed
		 * */
		String Query = "INSERT INTO Luxurycars (make, model, year, price, color) VALUES (?, ?, ?, ?, ?)";
		
		
		try {
			conn = DBconn.getConnection(); // getting the connection to communicate with the database
			
			pstmt = conn.prepareStatement(Query); // converting the string query to the prepared statement with the input data
			
			// adding the data into the prepared statement
			pstmt.setString(1, car.getMake());
			pstmt.setString(2, car.getModel());
			pstmt.setInt(3, car.getYear());
			pstmt.setDouble(4, car.getPrice());
			pstmt.setString(5, car.getColor());
			
			int RA = pstmt.executeUpdate(); // now this will execute the statement which we prepared above and returns the number of row affected
			// row affected (RA)
			
			/* NOW here we are adding only one data at a time so after this statement executes then one row must be affected SO*/
			if(RA == 1) {
				System.out.println("Data Added Successfully!!!");
			}
			else {
				System.out.println("Failed to add car, please try again.");
			}
			
		} catch (Exception e) {
			System.out.println("Error Adding the car, please try again.");
			e.printStackTrace(); // will print the error
		}
		finally { // it will execute not depending on try or catch
			try {
				
				if(pstmt != null) pstmt.close(); // closing the query connection
				if(conn != null) conn.close(); // closing the main connection
				
			} catch (Exception e2) {
				System.out.println("Error closing the connection, please try again.");
				e2.printStackTrace();
			}
		}
	}
}
