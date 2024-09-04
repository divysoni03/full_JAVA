// 4. Encryption and Decryption:
//    Implement a Java application that encrypts sensitive user data (like passwords) using a chosen encryption algorithm and allows decryption for authorized users.

import java.util.Scanner;
import java.util.Random;

public class Task4 {
    public static String encryption(String msg, int key) {
        StringBuilder encryptedText = new StringBuilder();
        for (char c : msg.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                char shiftedChar = (char) ((c - 'a' + key) % 26 + 'a');
                encryptedText.append(shiftedChar);
            } else if (c >= 'A' && c <= 'Z') {
                char shiftedChar = (char) ((c - 'A' + key) % 26 + 'A');
                encryptedText.append(shiftedChar);
            } else {
                encryptedText.append(c);
            }
        }
        return encryptedText.toString();
    }

    public static String decryption(String msg, int key) {
        StringBuilder decryptedText = new StringBuilder();
        for (char c : msg.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                char shiftedChar = (char) ((c - 'a' - key + 26) % 26 + 'a');
                decryptedText.append(shiftedChar);
            } else if (c >= 'A' && c <= 'Z') {
                char shiftedChar = (char) ((c - 'A' - key + 26) % 26 + 'A');
                decryptedText.append(shiftedChar);
            } else {
                decryptedText.append(c);
            }
        }
        return decryptedText.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        final int key = rand.nextInt(26);

        System.out.print("Enter Message: ");
        String msg = sc.nextLine();

        String encryptedMsg = encryption(msg, key);
        System.out.println("\n\nEncrypted Message: " + encryptedMsg + "\nKey: " + key);

        String decryptedMsg = decryption(encryptedMsg, key);
        System.out.println("\nDecrypted Message: " + decryptedMsg);

        sc.close();
    }
}
