// 27. Write a Java program to find the number of even and odd integers in a given array of integers.

public class Task27 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.print("Even numbers in arr : ");
        for(int ele : arr) {
            if(ele %2 ==0 ) {
                System.out.print(ele + ", ");
            }
        }

        System.out.print("\nOdd numbers in arr : ");
        for(int ele : arr) {
            if(ele%2 != 0) {
                System.out.print(ele + ", ");
            }
        }
    }    
}
