// 21. Write a Java program to display the pattern like a diamond.

// Test Data
// Input number of rows (half of the diamond) : 7
// Expected Output :

                                                                                 
//       *                                                                          
//      ***                                                                         
//     *****                                                                        
//    *******                                                                       
//   *********                                                                      
//  ***********                                                                     
// *************                                                                    
//  ***********                                                                     
//   *********                                                                      
//    *******                                                                       
//     *****                                                                        
//      ***                                                                         
//       *    

import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Upper part of the pattern
        for (int i = 0; i < n; i++) {
            // Loop for spaces
            for (int j = n; j > i + 1; j--) {
                System.out.print(" ");
            }
            // Loop for stars
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = n - 1; i >= 0; i--) {
            // Loop for spaces
            for (int j = n; j > i + 1; j--) {
                System.out.print(" ");
            }
            // Loop for stars
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
