// 33. Write a Java program to remove duplicate elements from a given array and return the updated array length.
// Sample array: [20, 20, 30, 40, 50, 50, 50]
// After removing the duplicate elements the program should return 4 as the new length of the array. 

public class Task33 {
    public static void main(String []args) {
        int[] arr = {20, 20, 30, 40, 50, 50, 50};

        int index=0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] != arr[index]) {
                index++; 
                arr[index] = arr[i];
            }
        }

        for(int i=0;i<index+1;i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("\nnew Size : " + index+1);
    }
}