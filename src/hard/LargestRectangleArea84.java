package hard;

import java.util.Arrays;

public class LargestRectangleArea84 {

    // 超时
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        int[] leftList = new int[heights.length];
        leftList[0] = 0;
        int[] rightList = new int[heights.length];
        rightList[heights.length - 1] = heights.length - 1;
        int max = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i - 1] >= heights[i]) {
                leftList[i] = leftList[i - 1];
            } else {
                leftList[i] = i;
            }
        }
        for (int i = heights.length - 2; i >= 0; i--) {
            if (heights[i + 1] >= heights[i]) {
                rightList[i] = rightList[i + 1];
            } else {
                rightList[i] = i;
            }
        }
        System.out.println(Arrays.toString(heights));
        System.out.println(Arrays.toString(leftList));
        System.out.println(Arrays.toString(rightList));
        for (int i = 0; i < heights.length; i++) {
            max = Math.max(max, heights[i] * (rightList[i] - leftList[i] + 1));
        }
        return max;
    }
}
