package com.util;

import java.sql.Connection; // for making connection
import java.sql.DriverManager;

public class DbConn {
	private static String URL = "jdbc:mysql://localhost:3306/project0";
	private static String USERNAME = "root";
	private static String PASSWORD = "root";
	
	public static Connection getConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			if(conn != null) {
				System.out.println("Database connected successfully.");
			}
			else {
				System.out.println("Error connecting to database.");
			}
		} catch (Exception e) {
			System.out.println("Error Making connection, please try again.");
			e.printStackTrace();
		}
		
		return conn;
	}
}
