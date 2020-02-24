package mid;

import java.util.Arrays;

//300 最长不降
public class LengthOfLIS {

    public static void main(String args[]) {
        System.out.println(new LengthOfLIS().lengthOfLIS(new int[]{1, 2, 3, 4, 5, 1, 32, 1}));
    }

    public int lengthOfLIS(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int[] maxL = new int[nums.length];
        maxL[0] = 1;
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            maxL[i] = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    maxL[i] = Math.max(maxL[j] + 1, maxL[i]);
                    max = Math.max(maxL[i], max);
                }
            }
        }
        return max;
    }

    public int lengthOfLISDP(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int[] maxL = new int[nums.length];
        maxL[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            int temp = 0;
            for (int j = 0; j < i; j++) {
                if (temp < maxL[j] + 1 && nums[i] > nums[j]) {
                    temp = maxL[j] + 1;
                }
            }
            if (temp == 0) {
                maxL[i] = maxL[i - 1];
            } else {
                maxL[i] = temp;
            }
        }
        return maxL[maxL.length - 1];
    }
}
