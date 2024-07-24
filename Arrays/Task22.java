// 22. Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.
import java.util.Scanner;
public class Task22 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5};
        System.out.print("Enter A Specific number :");
        int num = sc.nextInt();
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] + arr[j] ==num) {
                    System.out.println("["+i+", "+j+"] => " + num);
                }
            }
        }
        sc.close();
    }
}
