//1. Write a Java program to take the user's name as input and display a personalized greeting message.

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Name :");
		String name = sc.nextLine();
		System.out.println("Hello, Welcome "+name);
		sc.close();
	}
}