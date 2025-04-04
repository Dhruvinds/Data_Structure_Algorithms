package ArrayAlgorithms;

public class TrappedWater {
    public static int TrappedRainWater(int height[]) {
        // Calculate the left max Boundary
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate the right max Boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Loop
        int trappWater = 0;
        for (int i = 0; i < n; i++) {
            // waterlevel = min(left max , right max)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = water level - height
            trappWater = (trappWater + waterLevel) - height[i];
        }
        return trappWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(TrappedRainWater(height));
    }
}
