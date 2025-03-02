import java.util.*;
public class Function{

    // public static float avgOfNum(int a, int b, int c){
    //     int sum = a + b + c;
    //     int avg = sum/3;
    //     return avg;
    // }

    // public static boolean isEven(int n){
    //     if(n % 2 == 0){
    //         return true;
    //     }
    //     return false;
    // }

    public static boolean isPalindrome(int n){
        int myNum = n;
        int reverse = 0;
        while(n>0){
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
            // System.out.println(reverse);
        }
        return myNum == reverse;
    }

    public static void main(String args[]){
        // System.out.println(avgOfNum(10, 10, 10));
        // System.out.println(isEven(499));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}