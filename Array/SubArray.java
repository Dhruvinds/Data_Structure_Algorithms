package Array;

public class SubArray {
    public static void Sub_Array(int number[]) {
        // start logic
        int ts = 0;
        for (int i = 0; i < number.length; i++) {
            // int sum = 0;
            int start = i;
            // System.out.println(start);
            // end logic
            for (int j = i; j < number.length; j++) {
                int end = j;
                // System.out.println(end);
                // printing
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                    ts++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArray is: " + ts);
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        Sub_Array(number);
    }
}
