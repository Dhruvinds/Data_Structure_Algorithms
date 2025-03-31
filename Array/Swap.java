package Array;

public class Swap {
    // public static void swap_num(int arr[]) {
    // int temp = arr[0];
    // arr[0] = arr[1];
    // arr[1] = temp;
    // }

    public static int LinearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // int arr[] = new int[2];
        // arr[0] = 2;
        // arr[1] = 5;

        // System.out.println(arr[0] + "," + arr[1]);
        // swap_num(arr);
        // System.out.println(arr[0] + "," + arr[1]);

        // int arr[] = { 10, 13, 11, 5, 14 };
        // int target = 11;
        // System.out.println(LinearSearch(arr, 14));

        int arr[] = { 10, 12, 15, 19, 24, 32, 34, 38, 50 };
        System.out.println(BinarySearch(arr, 50));
    }
}
