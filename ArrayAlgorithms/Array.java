package ArrayAlgorithms;

import java.util.*;

public class Array {
    // public static void SubArraySum(int number[]) {
    // Time Complexity : O(n3)
    // Brute Force Approach
    // int curr_sum = 0;
    // int max_sum = Integer.MIN_VALUE;

    // for (int i = 0; i < number.length; i++) {
    // for (int j = i; j < number.length; j++) {
    // curr_sum = 0;
    // for (int k = i; k <= j; k++) {
    // // Printing Sum of Sub Array
    // curr_sum += number[k];
    // System.out.print(number[k] + " ");
    // }
    // System.out.println("= " + curr_sum);
    // if (max_sum < curr_sum) {
    // max_sum = curr_sum;
    // }
    // }

    // }
    // System.out.println("Max Subarray sum is: " + max_sum);
    // }

    public static void PrefixSum(int number[]) {
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        // Calculate Prefix Array
        prefix[0] = number[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
            System.out.println(prefix[i]);
        }

        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                // curr_sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                curr_sum = 0;
                if (i == 0) {
                    curr_sum = prefix[j];
                    // System.out.println(prefix[j]);
                } else {
                    curr_sum = prefix[j] - prefix[i - 1];
                }

                if (max_sum < curr_sum) {
                    max_sum = curr_sum;
                }
            }
        }
        System.out.println("Max sum of Sub Array is: " + max_sum);
    }

    public static void main(String[] args) {
        int number[] = { 1, -2, 6, -1, 3 };
        // SubArraySum(number);
        PrefixSum(number);
    }
}
