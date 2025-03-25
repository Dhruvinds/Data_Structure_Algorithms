package Array;

// public class LinearSearch {

//     public static int Array_Search(int number[], int key) {
//         for (int i = 0; i < number.length; i++) {
//             if (number[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int number[] = { 10, 20, 30, 40, 50, 52, 58, 100 };
//         int key = 55;

//         int index = Array_Search(number, key);
//         if (index == -1) {
//             System.out.println("NOT Found!");
//         } else {
//             System.out.println("Key is at the Index: " + index);
//         }
//     }
// }

public class LinearSearch {
    public static int Find_Player(String players[], String key) {
        for (int i = 0; i < players.length; i++) {
            if (players[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String players[] = { "Virat", "Rohit", "Sachin", "Hardik" };
        String key = "Virat";

        int index = Find_Player(players, key);
        if (index == -1) {
            System.out.println("Player not FOUND!");
        } else {
            System.out.println("Player is: " + players[index]);
        }
    }
}
