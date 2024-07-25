// 26. Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.

public class Task26 {
    public static void main(String []args) {
        int[] arr = {1,0,0,1,1,0,1,0};

        System.out.print("Before sorting : ");
        for(int ele : arr) {
            System.out.print(ele + ", ");
        }

        int i=0,j= arr.length-1;
        while(i<j) {
            if(arr[i] == 0 && arr[j] == 1) {
                arr[i] ^= arr[j];
                arr[j] ^= arr[i];
                arr[i] ^= arr[j];
                i++;j--;
            }
            else if(arr[i] == 1) {
                i++;
            }
            else if(arr[j] == 0) {
                j--;
            }
        }

        System.out.print("\nAfter sorting : ");
        for(int ele : arr) {
            System.out.print(ele + ", ");
        }
    }    
}
