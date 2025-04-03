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
        // Optimized Solution as compared to Brute Force
        // O(n2)

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

    public static void KadanesAlgo(int number[]) {
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            curr_sum = curr_sum + number[i];

            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(curr_sum, max_sum);
        }
        System.out.println("Maximum sum of an array is: " + max_sum);
    }

    public static void KadanesAlgoNegative(int number2[]) {
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int maxsum_element = Integer.MIN_VALUE;

        for (int i = 0; i < number2.length; i++) {
            curr_sum = curr_sum + number2[i];

            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(curr_sum, max_sum);

            maxsum_element = Math.max(maxsum_element, number2[i]);
        }

        if (max_sum == 0) {
            max_sum = maxsum_element;
        }

        System.out.println("Max Sum of All Negative Number is: " + max_sum);
    }

    public static void main(String[] args) {
        int number[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

        int number2[] = { -1, -2, -3, -4 };
        // SubArraySum(number);
        // PrefixSum(number);
        // KadanesAlgo(number);
        KadanesAlgoNegative(number2);
    }
}
