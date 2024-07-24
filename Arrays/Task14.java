// 14. Write a Java program to find common elements between two arrays (string values).

import java.util.Scanner;

public class Task14 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        String[] str = {"divy", "shrey sir", "divy", "pratham"};
        for(int i=0;i<str.length-1;i++) {
            for(int j=i+1;j<str.length;j++) {
                if(str[i] == str[j]) {
                    System.out.println("Both are Equal " + str[i] + " at " + i + str[j] + " at "+ j);
                    return;
                }
            }
        }
        // System.out.println("There are no common values");
        sc.close();
    }    
}
