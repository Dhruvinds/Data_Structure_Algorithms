package ArrayAlgorithms;

import java.util.*;

public class GetValue {
    public static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }

            if(smallest>number[i]){
                smallest=number[i];
            }
        }
        System.out.println(smallest);
        return largest;
    }

    public static void main(String[] args) {
        int number[] = { 0, 6, 5, 8, 3, 5 };
        System.out.println("Largest number in array is: " + getLargest(number));

    }
}
