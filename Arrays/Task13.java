// 13. Write a Java program to find duplicate values in an array of string values.
import java.util.Scanner;
public class Task13 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];
        for(int i=0;i<str.length;i++) {
            System.out.print(i + ": ");
            str[i] = sc.next();
        }
        for(String s : str) {
            System.out.print(s + ", ");
        }
    }
}