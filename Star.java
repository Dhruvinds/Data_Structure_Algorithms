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

    public static void InvertedPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
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
        InvertedPyramid(5);

    }
}
