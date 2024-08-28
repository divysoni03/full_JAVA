// 1. Data Validation:
//    Design a Java program that validates and sanitizes user-provided email addresses, ensuring they adhere to standard email format rules (e.g., presence of '@' and '.' symbols, proper domain format).

import java.util.Scanner;

public class Task1 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        String email = new String();
        System.out.println("Enter Your Email : ");
        email = sc.nextLine();
        email = email.toLowerCase();

        boolean isAt = false, isDot = false, isDomain = false;
        if(email.contains("@")) isAt = true;
        if(email.contains(".")) isDot = true;
        if(email.contains("gmail.com") || email.contains("outlook.com")) isDomain = true; 

        if(isAt && isDot && isDomain) {
            System.out.println("\nEmail : " + email);
            System.out.println("\n@ " + (isAt ? "passes":"not passed"));
            System.out.println("\n. "+(isDot ? "passes":"not passed"));
            System.out.println("\nDomain "+(isDot ? "passes":"not passed"));
            System.out.println("\nEmail passes all the condition.");
        }
        else {
            System.out.println("\nEmail : " + email);
            System.out.println("\n@ " + (isAt ? "passes":"not passed"));
            System.out.println("\n. "+(isDot ? "passes":"not passed"));
            System.out.println("\nDomain "+(isDot ? "passes":"not passed"));
            System.out.println("\nEmail not passed all the condition so please enter valid email.");
        }

        sc.close();
    }
}
