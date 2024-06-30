// 4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.

// Test Data
// Input a number: 25
// Expected Output :
// Input value: 25
// Positive number

import java.util.Scanner;

public class task4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number : ");
        float num = sc.nextFloat();

        if(num == 0){
            System.out.println("Input number : " + num);
            System.out.println("Number is Zero");
        }
        else if(num > 0){
            System.out.println("Input number : " + num);
            System.out.println("Number is positive");
        }
        else {
            System.out.println("Input number : " + num);
            System.out.println("Number is negative");
        }
        sc.close();
    }
}   
