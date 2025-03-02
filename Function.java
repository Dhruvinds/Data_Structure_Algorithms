public class Function{

    public static float avgOfNum(int a, int b, int c){
        int sum = a + b + c;
        int avg = sum/3;
        return avg;
    }

    public static void main(String args[]){
        System.out.println(avgOfNum(10, 10, 10));
    }
}