// 32. Write a Java program to check if an array of integers contains two specified elements 65 and 77.

public class Task32 {
    public static void main(String []args) {
        int []arr = {1,2,34,4,67,77,2,3,4};
        for(int j=0;j<arr.length;j++) {
            if(arr[j] == 67) {
                System.out.print("this array contains 67 at index : " + j);
                for(int i=j+1;i<arr.length;i++) {
                    if(arr[i] == 77) {
                        System.out.print("\nthis array contains 77 at index : " + i);
                    }
                }
            }
        }
    }    
}
