// 22. Write a Java program to display Pascal's triangle.

// Test Data
// Input number of rows: 5
// Expected Output :

// Input number of rows: 5                                                          
//       1                                                                          
//      1 1                                                                         
//     1 2 1                                                                        
//    1 3 3 1                                                                       
//   1 4 6 4 1    

import java.util.Scanner;

public class task22 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows : ");
        int row = sc.nextInt();
        
        for(int i=0;i<row;i++){
            for(int k=row-i;k>0;k--){
                System.out.print(" ");
            }
            int c = 1;
            for(int j=0;j<i;j++){
                c  = c*(i - j) / (j + 1);
                System.out.print(c +" "); 
            }
            System.out.println();
        }
        sc.close();
    }   
}
