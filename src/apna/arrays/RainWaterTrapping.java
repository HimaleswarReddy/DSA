package apna.arrays;

public class RainWaterTrapping {
    public static void main(String[] args) {
        int bars[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(rainWater(bars));
    }
    public static int rainWater(int heights[]) {
        int leftMax[] = new int[heights.length];
        leftMax[0] = heights[0];
        int rightMax[] = new int[heights.length];
        rightMax[rightMax.length - 1] = heights[heights.length - 1];
        for (int i = 1; i < heights.length; i++) {
            leftMax[i] = Math.max(leftMax[i-1], heights[i]);
            rightMax[rightMax.length - i - 1] = Math.max(rightMax[rightMax.length - i], heights[heights.length - i -1] );
        }
        int waterStored = 0;
        for (int i = 0; i < heights.length; i++) {
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            if(waterlevel - heights[i] > 0) {
                waterStored += waterlevel - heights[i];
            }
        }
        return waterStored;
    }
}
