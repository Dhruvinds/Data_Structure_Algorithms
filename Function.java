public class Function{

    // public static float avgOfNum(int a, int b, int c){
    //     int sum = a + b + c;
    //     int avg = sum/3;
    //     return avg;
    // }

    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        // System.out.println(avgOfNum(10, 10, 10));
        System.out.println(isEven(499));
    }
}