public class Math {
    public static int CountDigit(int n) {
        // Brute Force Approach
        // int counter = 0;
        // while (n > 0) {
        // counter += 1;
        // n /= 10;
        // }
        // return counter;

        // Optimal Approach
        int counter = (int) (java.lang.Math.log10(n) + 1);
        return counter;
    }

    public static void main(String args[]) {
        // Count a Digit in a number:
        System.out.println(CountDigit(12345));
    }
}
