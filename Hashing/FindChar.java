package Hashing;

import java.util.*;

public class FindChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int hash[] = new int[26];
        char arr[] = new char[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
            hash[arr[i] - 'a']++;
        }

        int query = sc.nextInt();

        while (query-- > 0) {
            char ch = sc.next().charAt(0);
            System.out.println(hash[ch - 'a']);
        }
    }
}
