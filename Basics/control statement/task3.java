// 3. Write a Java program that takes three numbers from the user and prints the greatest number.

// Test Data
// Input the 1st number: 25
// Input the 2nd number: 78
// Input the 3rd number: 87
// Expected Output :
// The greatest: 87

import java.util.Scanner;

public class task3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b){
            if(a > c){
                System.out.print("Number : " + a + " is Greatest !");
            }
            else {
                System.out.print("Number : " + c + " is Gretest !");
            }
        }
        else {
            if(b > c){
                System.out.print("Number : " + b + " is Gretest !");
            }
            else {
                System.out.print("Number : " + c + " is Gretest !");
            }
        }

        sc.close();
    }
}
