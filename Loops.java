import java.util.*;

public class Loops {
    public static void main(String args[]) {
        // int number = 1;
        // while(number <=10){
        // System.out.print(number + " ");
        // number++;

        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        // int range = 1;

        // while (range <= number) {
        // System.out.print(range + " ");
        // range++;
        // int sum = 0;

        // while (range <= number) {
        // sum = sum + range;
        // range++;
        // }
        // System.out.println(sum);

        // For Loops!

        // ****
        // ****
        // ****
        // ****
        // int line = 4;
        // for(int i = 1; i<=line; i++){
        // System.out.println("****");
        // }

        // Reverse Number -> 12345 -> 54321
        // int number = 12345;
        // int reverse = 0;
        // while(number>0){
        // int remainder = number % 10;
        // reverse = reverse * 10 + remainder;
        // System.out.print(remainder);
        // number = number/10;
        // }

        // Do While:

        // int count = 1;
        // do {
        // System.out.println(count + " " + "Hello Java!");
        // count++;
        // } while (count <= 10);

        // Break Statement:

        // for(int i = 1 ; i<=5; i++){
        // if(i==3){
        // break;
        // }
        // System.out.println(i);
        // }
        // System.out.println("I am out of the loops!");

        // Scanner sc = new Scanner(System.in);

        // do {
        // System.out.println("Enter your number: ");
        // int n = sc.nextInt();
        // if (n % 10 == 0) {
        // break;
        // }
        // System.out.println(n);
        // } while (true);

        // Continue Statement to skip an iteration

        // for(int i = 1; i<=5; i++){
        // if(i==3){
        // continue;
        // }
        // System.out.println(i);
        // }

        // do {
        // System.out.println("Enter number: ");
        // int n = sc.nextInt();
        // if(n % 10 == 0){
        // continue;
        // }
        // System.out.println(n);
        // } while (true);

        // Prime or not prime!

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // boolean isPrime = true;

        // if (n == 2) {
        //     System.out.println("Number is Prime");
        // } else {
        //     // for optimize -> for non optimize n-1
        //     for (int i = 2; i <= Math.sqrt(n); i++) {
        //         if (n % i == 0) {
        //             isPrime = false;
        //         }
        //     }

        //     if (isPrime == true) {
        //         System.out.println("Number is Prime");
        //     } else {
        //         System.out.println("Number is not Prime");
        //     }
        // }

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sumEven = 0;
        int sumOdd = 0;

        do{
            if(num % 2 == 0){
                sumEven += num;
            }else{
                sumOdd += num;
            }
            int choice = sc.nextInt;
        }while(choice == 1);

        System.out.println("Sum of Even number is: " + sumEven);
        System.out.println("Sum of Odd number is: " + sumOdd);

    }
}
