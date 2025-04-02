package ArrayAlgorithms;

import java.util.*;

public class Array {
    public static void SubArraySum(int number[]) {
        // Time Complexity : O(n3)
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                curr_sum = 0;
                for (int k = i; k <= j; k++) {
                    // Printing Sum of Sub Array
                    curr_sum += number[k];
                    System.out.print(number[k] + " ");
                }
                System.out.println("= " + curr_sum);
                if (max_sum < curr_sum) {
                    max_sum = curr_sum;
                }
            }

        }
        System.out.println("Max Subarray sum is: " + max_sum);
    }

    public static void main(String[] args) {
        int number[] = { 1, -2, 6, -1, 3 };
        SubArraySum(number);
    }
}
