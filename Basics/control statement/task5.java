// 5. Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.

// Test Data
// Input number: 3
// Expected Output :
// Wednesday

import java.util.Scanner;

public class task5 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number : ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Input, Try again !");
                break;
        }
        
        sc.close();
    }
}
