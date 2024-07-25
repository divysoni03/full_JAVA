// 28. Write a Java program to get the difference between the largest and smallest values in an array of integers. The array must have a length of at least 1.

public class Task28 {
    public static void main(String []args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int max = arr[0], min = arr[0];

        if(arr.length <=1) {
            System.out.println("Array length should be greater then 1, please enter again.");
        }
        for(int ele : arr) {
            if(max < ele) {
                max = ele;
            }
            else if(min > ele) {
                min = ele;
            }
        }

        System.out.println("max number in array : " + max + "\nminimum number in arr : " + min + "\nDifference between them is : " + (max-min));
    }    
}
