// 16. Write a Java program to display the pattern like a right angle triangle with a number.

// Test Data
// Input number of rows : 10
// Expected Output :

// 1                                                                                
// 12                                                                               
// 123                                                                              
// 1234                                                                             
// 12345                                                                            
// 123456                                                                           
// 1234567                                                                          
// 12345678                                                                         
// 123456789                                                                        
// 12345678910

import java.util.Scanner;

public class task16 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();

        for(int i=0;i<rows;i++) {
            for(int j=0;j<i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
        sc.close();
    }   
}
