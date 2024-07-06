// 1. Write a Java program to sort a numeric array and a string array.

import java.util.Scanner;

public class Task1 {

    public void bubbleSort(int array[],int size){
        for(int i=0;i<array.length-1;i++) {
            for(int j=i+1;j<array.length;j++) {
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void bubbleSortString(String array[],int size) {
        for(int i=0;i<array.length-1;i++) {
            for(int j=i+1;j<array.length;j++) {
                if(array[i].compareTo(array[j]) > 0){
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

	public static void printArray(int array[],int size) {
		for(int i: array) {
			System.out.print(i + ", ");
		}
	}
	public static void printArrayString(String array[],int size) {
		for(String i: array) {
			System.out.print(i + ", ");
		}
	}
	
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1.Enter numeric array\n2.Enter String array\n0.Exit\n\nEnter Your choice : ");
        int choice = sc.nextInt();

        System.out.print("Enter Size of array :");
        int size = sc.nextInt();

        switch(choice) {
            case 1:
                int array[] = new int[size];
                Task1 t = new Task1();
                for(int i=0;i<size;i++) {
                    System.out.print("Enter Your " + i + "\'th value :");
                    array[i] = sc.nextInt();
                }
				t.bubbleSort(array,size);
				printArray(array,array.length);
                break;
            case 2:
                String stringArray[] = new String[size];
				
                for(int i=0;i<size;i++) {
                    System.out.print("Enter Your " + i + "\'th value :");
                    stringArray[i] = sc.next();
                }
                bubbleSortString(stringArray, size);
				printArrayString(stringArray,size);
                break;
            case 0:
                System.out.println("Exiting the program...");
                break;
            default :
                System.out.println("Invalid Input");
        }
    }    
}
