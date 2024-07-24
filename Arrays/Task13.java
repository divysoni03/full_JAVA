// 13. Write a Java program to find duplicate values in an array of string values.
import java.util.Scanner;
public class Task13 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String[] str1 = new String[5];
        String[] str2 = new String[5];
        System.out.println("String Array One ;");
        for(int i=0;i<str1.length;i++) {
            System.out.print(i + ": ");
            str1[i] = sc.next();
        }
        System.out.println("\nString Array Two ;");
        for(int i=0;i<str2.length;i++) {
            System.out.print(i + ": ");
            str2[i] = sc.next();
        }
        System.out.print("String Array One :");
        for(String s : str1) {
            System.out.print(s + ", ");
        }
        System.out.print("String Array Two :");
        for(String s : str2) {
            System.out.print(s + ", ");
        }

        for(int i=0;i<str1.length;i++) {
            for(int j=0;j<str2.length;j++) {
                if(str1[i].equalsIgnoreCase(str2[j])) {
                    System.out.print("\nCommon at ["+i+", "+j+"] : " + "str1 :" + str1[i] + " str2 :" + str2[j]);
                }  
            }
        }
        // System.out.println("\nThere are no common in the array.");
        sc.close();
    }
}