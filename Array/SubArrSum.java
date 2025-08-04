package Array;

public class SubArrSum {
    public static void Sub_Arr_Sum(int number[]) {
        for (int i = 0; i < number.length; i++) {
            int curr = 0;
            for (int j = i; j < number.length; j++) {  
                curr += number[j];
                for (int k = i; k <= j; k++) {
                    System.out.print(number[k] + " ");
                }
                System.out.println("= Subarray Sum: " + curr);
            }
        }
    }

    public static void main(String[] args) {
        int number[] = {2,3,4,5,6,7};
        Sub_Arr_Sum(number);
    }
}
