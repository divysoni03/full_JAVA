// 23. Write a Java program to generate the following * triangles.

// Test Data
// Input the number: 6
// Expected Output :

// ******                                                   
//  *****                                                   
//   ****                                                   
//    ***                                                   
//     **                                                   
//      * 

import java.util.Scanner;

public class task23 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        for(int i=0;i<row;i++) {
            for(int j=i;j<row;j++){
                System.out.print("*");
            }
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }    
}
