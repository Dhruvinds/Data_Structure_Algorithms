package OOPS;

import java.util.Arrays;

class Ex{
    int [] data;

    Ex(int [] values){
        data = values;
    }
    public void showData(){
        System.out.println(Arrays.toString(data));
    }
}

public class Main {
    public static void main(String[] args) {
        Ex obj = new Ex (new int[]{1, 2, 3, 4, 5});
        obj.showData();
    }
}
