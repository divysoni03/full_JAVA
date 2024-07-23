// 9. Write a Java program to insert an element (specific position) into an array.

import java.util.Scanner;

public class Task9 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        for(int i=0;i<arr.length;i++) {
            System.out.print("Enter "+ i + "th Value :");
            arr[i] = sc.nextInt();
        } 
        System.out.print("Array : [");
        for(int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.print("\b\b]");

        System.out.print("\nEnter Index to add number :");
        int new_index = sc.nextInt();
        int new_ele;
        if(new_index >= arr.length) {
            System.out.print("ERROR : invalid index please enter within range.");
        }
        else {
            System.out.print("\nEnter New Element :");
            new_ele = sc.nextInt();
            int i =new_index;
            arr[i] = new_ele;
            for(i=new_index+1;i<arr.length-1;i++) {
                arr[i] = arr[i+1];
            }
        }
        for(int i: arr) {
            System.out.print(i + ", ");
        }
        sc.close();
    }
}