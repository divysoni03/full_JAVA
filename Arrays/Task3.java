// 3. Write a Java program to print the following grid.
// 
// Expected Output :
// 
// - - - - - - - - - -                                                                                           
// - - - - - - - - - -                                                                                           
// - - - - - - - - - -                                                                                           
// - - - - - - - - - -                                                                                           
// - - - - - - - - - -                                                                                           
// - - - - - - - - - -                                                                                           
// - - - - - - - - - -                                                                                           
// - - - - - - - - - -                                                                                           
// - - - - - - - - - -                                                                                           
// - - - - - - - - - - 

import java.util.Scanner;

public class Task3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size : ");
		int size = sc.nextInt();
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print("- ");
			}
			System.out.println();
		}
		sc.close();
	}
}