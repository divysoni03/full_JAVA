// 6. Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.

// Test Data
// Input floating-point number: 25.586
// Input floating-point another number: 25.589
// Expected Output :
// They are different

import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number : ");
        float num1 = sc.nextFloat();
        System.out.print("Enter your Second number : ");
        float num2 = sc.nextFloat();

        if (Math.round(num1 * 1000) == Math.round(num2 * 1000)) {
            System.out.println("They are the same up to three decimal places.");
        } else {
            System.out.println("They are different.");
        }   
        sc.close();
    }
}
