// 2. Write a Java program to sum values of an array.

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Array size :");
		int size = sc.nextInt();
		int[] array = new int[size];
		int sum = 0;
		for(int i=0;i<size;i++) {
			System.out.print("Enter Your " + i + "\'th Element : ");
			array[i] = sc.nextInt();
			sum += array[i];
		}
		System.out.print("Sum of array Element is " + sum + ".");
	}
}