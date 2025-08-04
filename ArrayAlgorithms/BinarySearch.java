package ArrayAlgorithms;

public class BinarySearch {

    public static int bSearch(int number[], int key) {
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 15, 18, 21, 25 };
        int key = 10;

        System.out.println("Key found at: " + bSearch(numbers, key));
    }
}
