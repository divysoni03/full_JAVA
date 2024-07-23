// 12. Write a Java program to find duplicate values in an array of integer values.

import java.util.Scanner;

public class Task12 {
    public static void displayArray(int[] arr) {
        System.out.print("Array : [");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " : ");
            arr[i] = sc.nextInt();
        }
        displayArray(arr);
        
        boolean foundDuplicate = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate found: I = " + i + ", J = " + j);
                    foundDuplicate = true;
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicates found.");
        }
        
        sc.close();
    }
}
