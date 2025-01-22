import java.util.*;

public class First{
    public static void main(String[] args){
        // int num = 55;
        // System.out.println(num++);
        // System.out.println(num);
        // System.out.println("Hello DSA!");

        // Data types:
        // Two Types: Primitive Data Type: Byte, short, char, int, float, double, long, boolean
        // Non Primitive Data Type: Classes, Interfaces, Arrays

        // Boolean check_value = true;
        // System.out.println(check_value);

        // byte a = 10;
        // System.out.println(a);

        // Input :

        Scanner sc = new Scanner(System.in);

        // String first_name = sc.next();
        // System.out.println(first_name);

        // String last_name = sc.nextLine();
        // System.out.println(last_name);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b;
        System.out.println("product of: " + product);
    }
}