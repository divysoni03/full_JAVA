// 2. Write a Java program to solve quadratic equations (use if, else if and else).

// Test Data
// Input a: 1
// Input b: 5
// Input c: 1
// Expected Output :
// The roots are -0.20871215252208009 and -4.7912878474779195

import java.util.Scanner;
import java.lang.Math;

public class task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = (int) (-b + Math.sqrt(Math.pow(b,2)+ (4*a*c)))/2*a;

        System.out.print(result);
        sc.close();
    }
}
