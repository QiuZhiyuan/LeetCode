package hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Trap42 {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        final int length = height.length;
        final int[] leftMax = new int[length];
        leftMax[0] = height[0];
        final int[] rightMax = new int[length];
        rightMax[length - 1] = height[length - 1];
        for (int i = 1; i < length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        System.out.println(Arrays.toString(leftMax));
        for (int i = length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        System.out.println(Arrays.toString(rightMax));
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return sum;
    }
}
