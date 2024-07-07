// 8. Write a Java program to copy an array by iterating the array.
import java.util.Scanner;

public class task8 {

    public static void printArray(int[] array){
        System.out.print("Array : [ ");
        for(int i: array) {
            System.out.print(i+", ");
        }
        System.out.print("\b\b]");
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size : ");
        int size = sc.nextInt();

        int[] arrayOne = new int[size];
        int[] arrayTwo = new int[size];

        for(int i=0;i<arrayOne.length;i++) {
            System.out.printf("Enter %d'th Value : ",i);
            arrayOne[i] = ((int)(Math.random()*100));
        }
        printArray(arrayOne);
        for(int i=0;i<arrayOne.length;i++) {
            arrayTwo[i] = arrayOne[i];
        }
        printArray(arrayTwo);

        sc.close();
    }
}
