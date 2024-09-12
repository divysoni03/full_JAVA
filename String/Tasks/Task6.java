// 6. String Manipulation:
//    Create a Java program that takes a user's input and formats it into a readable sentence, ensuring proper capitalization and removing leading/trailing spaces.

import java.util.Scanner;

public class Task6 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter A String :");
        str = sc.nextLine();
        String word = "";
        for(char ch: str.toCharArray()) {
            if(ch == ' ') {
                if(!word.isEmpty()) {
                    if(word.charAt(0) >= 'a' && word.charAt(0) <= 'z') {
                        word.charAt(0) = (word.charAt(0) - 'a') + 'A';
                    }
                }
            }
        }
    }
}
