// 8. Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

// Test Data
// Input an alphabet: p
// Expected Output :
// Input letter is Consonant

import java.util.Scanner;

public class task8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        char ch = sc.nextLine().charAt(0);
        if(ch >= 65 && ch <= 90 && ch >=97 && ch <= 122){
            System.out.println("Error : Can't Enter number, Please Enter One Character");
        }
        else if(ch == 'a'||ch=='A'||ch == 'e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
            System.out.println("Entered Character is Vowel");
        }
        else {
            System.out.println("Entered character is consonant ");
        }
        sc.close();
    }    
}
