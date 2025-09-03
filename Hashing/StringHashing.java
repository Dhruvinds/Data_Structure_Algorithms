package Hashing;

import java.util.*;

public class StringHashing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int hash[] = new int[256];

        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }

        int query = sc.nextInt();

        while (query-- > 0) {
            char ch = sc.next().charAt(0);
            System.out.println(hash[ch]);
        }
    }
}