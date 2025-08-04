package ArrayAlgorithms;

import java.util.*;

public class RainWater {
    public static int TrappedWater(int height[]) {
        int n = height.length;
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], height[i]);
        }

        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        int trapWater = 0;

        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftmax[i], rightmax[i]);
            trapWater += waterLevel - height[i];
        }
        return trapWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(TrappedWater(height));
    }
}
