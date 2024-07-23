// 11. Write a Java program to reverse an array of integer values.

import java.util.Scanner;

public class Task11 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0;i<arr.length;i++) {
            System.out.print(i + " :");
            arr[i] = sc.nextInt();
        }

        System.out.print("Array : [");
        for(int i : arr) {
            System.out.print(i+ ", ");
        }
        System.out.print("\b\b]");

        int i=0,j = arr.length-1;
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
        
        System.out.print("Array : [");
        for(int k : arr) { 
            System.out.print(k+ ", ");
        }
        System.out.print("\b\b]");
        sc.close();
    }
}
