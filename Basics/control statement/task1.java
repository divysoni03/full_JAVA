// 1. Write a Java program to get a number from the user and print whether it is positive or negative.

// Test Data
// Input number: 35
// Expected Output :
// Number is positive

import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if(a < 0){
            System.out.print("Enter number " + a + " is negetive");
        }
        else {
            System.out.print("Entered number " + a + " is positive");
        }
        sc.close();
    }
}
