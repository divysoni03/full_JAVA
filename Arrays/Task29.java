// 29. Write a Java program to compute the average value of an array of integers except the largest and smallest values.

public class Task29 {
    public static void main(String []args) {
        int []arr = {1,2,3,4,5,6,7,8};
        int max = arr[0],min = arr[0];
        int average = 0;

        for(int ele : arr) {
            if(max < ele) {
                max = ele;
            }
            else if(min > ele) {
                min = ele;
            }
        }
        for(int ele : arr) {
            if(ele != max || ele != min) {
                average += ele;
            }
        }
        average /= arr.length -2;

        System.out.println("Average Value : " + average);
    }
}
