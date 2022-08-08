package other;

import java.util.Arrays;

/**
 *  https://leetcode-cn.com/problems/two-sum/
 */

public class L1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new L1().twoSum(new int[]{2,7,11,15}, 9)));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] dNums = new int[nums.length];
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            dNums[i] = target - nums[i];
            for (int j = 0; j < i; j++) {
                if (nums[i] == dNums[j]) {
                    result[0] = j;
                    result[1] = i;
                    return result;
                }
            }
        }
        return result;
    }
}
