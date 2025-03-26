package Array;

public class ArrayPair {
    public static void Array_Pair(int number[]) {
        int tp = 0;
        // Outer loop first number
        for (int i = 0; i < number.length; i++) {
            int curr = number[i];
            // inner loop for printing second number
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + curr + "," + number[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pair in Array: " + tp);
    }

    public static void main(String args[]) {
        int number[] = { 2, 4, 6, 8, 10 };

        Array_Pair(number);
    }
}
