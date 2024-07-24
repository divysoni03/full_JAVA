// 24. Write a Java program to find a missing number in an array.
public class Task23 {
    public static void main(String []args) {
        int[] arr = {1,2,4,5,6};
        for(int i=1;i<arr.length;i++) {
                if(arr[i-1]+1 != arr[i]) {
                    System.out.println("Missing number :" + (arr[i]-1));
                }
        }
    }
}

// public class Task23 {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 4, 5, 6};

//         int missingNumber = findMissingNumber(arr);
//         System.out.println("Missing number: " + missingNumber);
//     }

//     public static int findMissingNumber(int[] arr) {
//         int n = arr.length + 1;  // Since one number is missing, the array length should have been n+1
//         int totalSum = n * (n + 1) / 2;  // Sum of the first n natural numbers

//         int arraySum = 0;
//         for (int num : arr) {
//             arraySum += num;
//         }

//         return totalSum - arraySum;
//     }
// }

/*import java.util.HashSet;

public class Task23 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};  // Example array

        int missingNumber = findMissingNumberUsingHashSet(arr);
        System.out.println("Missing number: " + missingNumber);
    }

    public static int findMissingNumberUsingHashSet(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int n = arr.length + 1;  // Since one number is missing, the array length should have been n+1

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                return i;  // Missing number found
            }
        }

        return -1;  // This should never be reached if input is correct
    }
}
 */