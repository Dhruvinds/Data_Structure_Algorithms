package ArrayAlgorithms;

public class LinearSearch {
    public static int Lsearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int number[] = { 10, 11, 12, 17, 18, 52, 59, 62 };
        int key = 55;
        int index = Lsearch(number, key);
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + index);
        }

    }
}
