// 25. Write a Java program to find common elements in three sorted (in non-decreasing order) arrays.

public class Task25 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 4, 5, 8, 10};
        int[] arr3 = {2, 4, 5, 7, 9};
        
        int i = 0, j = 0, k = 0;
        
        System.out.print("\nCommon Elements :");
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr1[i] == arr3[k]) {
                System.out.print(arr1[i] + ", ");
                i++;
                j++;
                k++;
            }
            else if (arr1[i] < arr2[j]) {
                i++;
            }
            else if (arr2[j] < arr3[k]) {
                j++;
            }
            else {
                k++;
            }
        }
        System.out.println("\b\b");
    }
}

