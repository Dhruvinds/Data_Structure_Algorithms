package Array;

import java.util.*;

public class LargestNum {
    public static int Largest_Number(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.println("Smallest number of an array is: " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int num[] = { 1, 5, 7, 8, 9, 3, 2 };
        System.out.println("Largest number of an array is: " + Largest_Number(num));
    }
}
