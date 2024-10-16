// DAO - database access object will connect to database to communicate with it.
package com.dao;

import com.util.DBconn; // for making the connection or communication with database
import com.model.CarModel; // importing the car model / object so we can use the data to add into the database
import com.mysql.cj.protocol.Resultset;

import java.sql.Connection; // for using connection and making connection
import java.sql.PreparedStatement; // for making prepared statements so no one can use SQL injections


import java.util.ArrayList; // for using array list to return the car objects
import java.sql.ResultSet; // to get result from SQL in form of set
import java.sql.Statement; // for FOR using query without prepared statement
import java.util.List;


public class CarDao {
	private Connection conn = null; // storing connection
	private PreparedStatement pstmt = null; // for making statement query
	
	private Statement stmt = null; // for making predefined statement
	
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

	public List<CarModel> getAllCars() {
		List<CarModel> cars = null;
		String query = "SELECT * FROM Luxurycars";
		
		try {
			conn = DBconn.getConnection();
			stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(query); // it will return the result set
			cars = new ArrayList<CarModel>(); // giving the list memory
//			if(rs.next()) {
//				System.out.println("Data received successfully!");
//			}
//			else {
//				System.out.println("Error Getting the data.");
//			}
			
			while(rs.next()) { // store all the data from the result set to cars list
				cars.add(
						new CarModel(
							rs.getInt("id"),
							rs.getString("make"),
							rs.getString("model"),
							rs.getInt("year"),
							rs.getDouble("price"),
							rs.getString("color")
						)
					);
			}
		} catch (Exception e) {
			System.out.println("Error Getting the data. please try again.");
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
				
			} catch (Exception e2) {
				System.out.println("Error Closing the connection, please try again.");
				e2.printStackTrace();
			}
		}
		
		return cars;
	} 

	public void deleteCarById(int id) {
		String query = "DELETE FROM Luxurycars WHERE id = ?"; // QUERY to delete the row at specific id
		
		try {
			conn = DBconn.getConnection(); // getting the connection
			pstmt = conn.prepareStatement(query); // preparing the statement
			
			pstmt.setInt(1, id); // setting the id into query
			
			int ra = pstmt.executeUpdate();
			
			if(ra == 1) {
				System.out.println("Car removed successfully.");
			}
			else {
				System.out.println("Error Couldn't find the car, please enter valid car id.");
			}
		} catch (Exception e) {
			System.err.println("Error please enter valid id, can't remove the car.");
			e.printStackTrace(); //printing the error
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				System.out.println("Error Couldn't close the connection.");
				e2.printStackTrace();
			}
		}
	}

	public CarModel getCarById(int id) {
		String query = "SELECT * FROM Luxurycars WHERE id = ?";
		CarModel car = null; // instance of the car
		
		try {
			conn = DBconn.getConnection();
			pstmt = conn.prepareStatement(query); // preparing statement
			
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("Car received successfully.");
			}
			else {
				System.out.println("Error Receiving car.");
			}
			
			// adding value to the object
			car = new CarModel(
						id, // we already have id
						rs.getString("make"),
						rs.getString("model"),
						rs.getInt("year"),
						rs.getDouble("price"),
						rs.getString("color")
					);
		} catch (Exception e) {
			System.out.println("Error : Could'nt find the car, please enter valid id.");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				System.out.println("Error closing the connection.");
				e2.printStackTrace();
			}
		}
		
		return car;
	}
	
	public void updateCarById(CarModel car) {
		String query = "UPDATE Luxurycars SET make = ?, model = ?, year = ?, price = ?, color = ? WHERE id = ?";
		
		try {
			conn = DBconn.getConnection();
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, car.getMake());
			pstmt.setString(2, car.getModel());
			pstmt.setInt(3, car.getYear());
			pstmt.setDouble(4, car.getPrice());
			pstmt.setString(5, car.getColor());
			pstmt.setInt(6, car.getId());
			
			int ra = pstmt.executeUpdate();
			if(ra == 1) {
				System.out.println("Car Updated successfully.");
			}
			else {
				System.out.println("Error updating the car, please try again.");
			}
		} catch (Exception e) {
			System.out.println("Error : updating the car, please try again.");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				System.out.println("Error closing the connection please try again.");
				e2.printStackTrace();
			}
		}
	}
}
