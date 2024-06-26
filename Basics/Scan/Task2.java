//2. Create a program that prompts the user to enter their age, and then determine if they are eligible for voting (age >= 18).

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Age : ");
		int age = sc.nextInt();
		
		if(age >= 18){
			System.out.println("You are Eligible for Voting !");
		}
		else {
			System.out.println("You are Not Eligible for Voting !");
		}
		sc.close();
	}
}