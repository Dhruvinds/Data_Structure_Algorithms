package Array;

import java.util.Scanner;

public class ArrayCC {

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        // System.out.println("Hello");
        // Scanner sc = new Scanner(System.in);
        // // int marks = sc.nextInt();

        // int marks[] = new int[50];
        // System.out.println("Length of an Array: " + marks.length);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("Physics: " + marks[0]);
        // System.out.println("Chemistry: " + marks[1]);
        // System.out.println("Maths: " + marks[2]);

        // marks[2] = 98;

        // System.out.println("Maths: " + marks[2]);

        // int num[] = {1,2,3};

        // int more_num[] = {4,5,6};

        // String fruits[] = {"Apple", "Banana", "Orange"};

        // System.out.println(fruits[1]);
        // System.out.println(more_num[0]);
        // System.out.println(num[2]);
        // System.out.println(marks[49]);

        int marks[] = { 97, 98, 99 };
        System.out.println(marks.length);
        update(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}