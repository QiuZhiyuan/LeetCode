package leetcode2022;

import common.Tools;

import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 10^4
 * -10^9 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 * Only one valid answer exists.
 */
public class P01_TwoSum {

    public static void main(String args[]) {
        P01_TwoSum twoSum = new P01_TwoSum();
        Tools.println(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
        Tools.println(twoSum.twoSum(new int[]{3, 2, 4}, 6));
        Tools.println(twoSum.twoSum(new int[]{3, 3}, 6));
        Tools.println(twoSum.twoSum(new int[]{109, -109}, 0));
        Tools.println(twoSum.twoSum(new int[]{0, -109}, -109));
    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int p = target - nums[i];
            Integer v0 = hashMap.get(p);
            if (v0 != null) {
                return new int[]{v0, i};
            } else if (!hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
