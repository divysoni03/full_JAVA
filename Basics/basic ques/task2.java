// 2. Write a Java program to print the sum of two numbers.
// Test Data:
// 74 + 36
// Expected Output :
// 110
import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two numbers :");
        int var1 = sc.nextInt(),var2 = sc.nextInt();
        System.out.print("Sum : " + (var1+var2));

        sc.close();
    }
}
