// 18. Write a Java program to find the second smallest element in an array.

import java.util.Scanner;
public class Task18 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,4,1,4,5,9,7};
        int min = arr[0],s_min = arr[0];
        for(int i=0;i<arr.length;i++) {
            if(min > arr[i]) {
                s_min = min;
                min = arr[i];
            }
            else if(s_min > arr[i] && min != arr[i]) {
                s_min = arr[i];
            }
        }
        System.out.print("Array : ");
        for(int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.print("\nMin :" + min + ", Second Min :" + s_min);
        sc.close();
    }
}