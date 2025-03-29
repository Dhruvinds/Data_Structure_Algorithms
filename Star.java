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

    public static void Buterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
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
        Buterfly(4);

    }
}
