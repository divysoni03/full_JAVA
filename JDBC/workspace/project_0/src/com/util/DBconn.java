// it will return the database connection to the DAO(database access object) so the DAO can communicate with the database

package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconn {
	
	private static String URL = "jdbc:mysql://localhost:3306/project0";
	private static String USERNAME = "root";
	private static String PASSWORD = "root";
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			if(conn != null) {
				System.out.println("Database Connected succesfully.");
			}
			else {
				System.out.println("Error Connecting to database.")	;
			}
		} catch (Exception e) {
			System.out.println("Error connecting to the database.");
			e.printStackTrace();
		}
		
		return conn; // returning the connection
	}
	
// for testing purpose
//	public static void main(String[] agrs) {
//		System.out.println(getConnection());	
//	}
}
