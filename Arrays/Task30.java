// 30. Write a Java program to check if an array of integers is without 0 and -1.

public class Task30 {
    public static void main(String []args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for(int ele : arr) {
            if(ele == 0 || ele == -1) {
                System.out.println("This array contains 0 & -1");
            }
        }
    }    
}
