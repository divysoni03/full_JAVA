// 10. Write a Java program to find the maximum and minimum value of an array.

import java.util.Scanner;

public class Task10 {
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
        int max = arr[0], min = arr[0];

        for(int i=0;i<arr.length;i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
            else if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("MAX :" + max + ", MIN :" + min);
        sc.close();
    }    
}
