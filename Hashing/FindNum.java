package Hashing;

import java.util.*;

public class FindNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of input: ");
        int maximum = Integer.MIN_VALUE;
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the " + num + "type of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        int hashArray[] = new int[maximum + 1];
        for (int i = 0; i < arr.length; i++) {
            hashArray[arr[i]]++;
        }
        int queries = sc.nextInt();
        while (queries-- > 0) {
            int n = sc.nextInt();
            if (n > maximum) {
                System.out.println(0);
            } else {
                System.out.println(hashArray[n]);
            }
        }
    }
}
