// 16. Write a Java program to remove duplicate elements from an array.

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = new int[5];
        int[] arr = {1, 2, 3, 4, 2, 1, 5};

        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; ) {
                if (arr[i] == arr[j]) {
                    for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    n--;
                    count++;
                } else {
                    j++;
                }
            }
        }

        System.out.print("Output: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Number of duplicates removed: " + count);

        sc.close();
    }
}

// time complexity O(n^3)
// space complexity O(n)

//we can do this using hashSet but i don't know hasSet
//time complexity O(n)
//space complexity O(1)