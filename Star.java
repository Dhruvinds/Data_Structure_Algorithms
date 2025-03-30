import java.util.*;

public class Star {

    // public static void Palidrom(int row, int column) {
    // for (int i = 1; i <= row; i++) {
    // for (int j = 1; j <= column; j++) {
    // if (i == 1 || i == row || j == 1 || j == column) {
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }
    // }

    // public static void InvertedPyramid(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // for (int k = 1; k <= i; k++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // public static void InvertedHalfPyramidNumbers(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= (n - i + 1); j++) {
    // System.out.print(j);
    // }
    // System.out.println();
    // }
    // }

    // public static void Floyd(int n) {
    // int counter = 1;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(counter + " ");
    // counter++;
    // }
    // System.out.println();
    // }
    // }

    // public static void Zero_OneTriangle(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // if ((i + j) % 2 == 0) {
    // System.out.print("1 ");
    // } else {
    // System.out.print("0 ");
    // }
    // }
    // System.out.println();
    // }
    // }

    // public static void Buterfly(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // for (int k = 1; k <= 2 * (n - i); k++) {
    // System.out.print(" ");
    // }
    // for (int l = 1; l <= i; l++) {
    // System.out.print("*");
    // }
    // System.out.println();

    // }

    // for (int i = n; i >= 1; i--) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // for (int k = 1; k <= 2 * (n - i); k++) {
    // System.out.print(" ");
    // }
    // for (int l = 1; l <= i; l++) {
    // System.out.print("*");
    // }
    // System.out.println();

    // }
    // }

    // public static void SolidRhombus(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= n; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // public static void HollowRhombus(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= n; j++) {
    // if (i == 1 || j == 1 || i == n || j == n) {
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }
    // }

    // public static void Diamond(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= 2 * i - 1; j++) {
    // System.out.print("*");
    // }
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // System.out.println();
    // }
    // for (int i = n; i >= 1; i--) {
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= 2 * i - 1; j++) {
    // System.out.print("*");
    // }
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // System.out.println();
    // }
    // }

    // public static void Reverse_Number(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n - i + 1; j++) {
    // System.out.print(j);
    // }
    // System.out.println();
    // }
    // }

    // public static void Rhombus(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i - 1; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= n; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    public static void NumberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // for (int i = 1; i <= 10; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // char ch = 'A';

        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(ch);
        // ch++;
        // }
        // System.out.println();
        // }

        // Palidrom Pattern
        // Palidrom(4, 5);

        // Inverted Rotated Pyramid:
        // InvertedPyramid(5);

        // Inverted Half Pyramid with numbers
        // InvertedHalfPyramidNumbers(5);

        // Floyd's Triangle
        // Floyd(5);

        // Zero One Triangle
        // Zero_OneTriangle(5);

        // Butterfly Pattern
        // Buterfly(4);

        // Solid Rhombus Pattern
        // SolidRhombus(5);

        // Hollow Rhombus
        // HollowRhombus(5);

        // Diamond Pattern
        // Diamond(4);

        // While Loop Pattern
        // Inverted Pyramid Pattern

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int total_n_line = n;
        // int curr_line = 1;
        // int star = 1;
        // int space = n - 1;

        // while (curr_line <= total_n_line) {
        // for (int i = 1; i <= space; i++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= star; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // space--;
        // star++;
        // curr_line++;
        // }

        // Half Triangle
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int total_line = n;
        // int curr_line = 1;
        // int star = n;

        // while (curr_line <= total_line) {
        // for (int i = 1; i <= star; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // curr_line++;
        // star--;
        // }

        // Diamond Pattern with no repetition;
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // // if we are using (n) then we get the triangle
        // int total_line = 2 * n - 1;
        // int curr_line = 1;
        // int space = n - 1;
        // int star = 1;

        // while (curr_line <= total_line) {
        // for (int i = 1; i <= space; i++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= star; j++) {
        // System.out.print("*");
        // }
        // if (curr_line < n) {
        // space--;
        // star += 2;
        // } else {
        // space++;
        // star -= 2;
        // }
        // System.out.println();
        // curr_line++;
        // }

        // Number increasing Reverse Pyramid
        // Reverse_Number(6);

        // Rhombus(5);

        // Triangle number
        NumberTriangle(6);

    }
}
