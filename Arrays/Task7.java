// 7. Write a Java program to remove a specific element from an array.

import java.util.Scanner;

public class Task7 {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The size of Array :");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		
		System.out.print("Array : [");
		for(int i=0;i<size;i++) {
			array[i] = (int)(Math.random() *100);
			System.out.print(array[i] + ", ");
		}
		System.out.println("\b\b\b]");
		
		System.out.print("Enter Number To be Deleted :");
		int num = sc.nextInt();
		for(int i=0;i<array.length-1;i++) {
			if(array[i] == num) {
				for(int j=i;j<array.length-1;j++) {
					array[j] = array[j+1];
				}
			}
		}
		System.out.print("Array : [");
		for(int i=0;i<array.length-1;i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("\b\b\b]");
	}
}