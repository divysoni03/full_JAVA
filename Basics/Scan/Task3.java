// 3. Build a Java application to collect the user's contact information (name, email, and phone number) and display it back to them.

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Details : ");
		String name = sc.nextLine();
		String email = sc.nextLine();
		String number = sc.nextLine();

		
		sc.close();
	}
}