// 17. Write a Java program to find the second largest element in an array.
import java.util.Scanner;
public class Task17 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,4,1,4,5,9,7};
        int max = arr[0],min = arr[0];
        for(int i=0;i<arr.length;i++) {
            if(max < arr[i]) {
                min = max;
                max = arr[i];
            }
            else if(min < arr[i] && max != arr[i]) {
                min =arr[i];
            }
        }
        System.out.print("Array : ");
        for(int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.print("\nMax :" + max + ", Min :" + min);
        sc.close();
    }
}
