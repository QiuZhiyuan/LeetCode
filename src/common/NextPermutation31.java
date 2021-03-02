package common;

import java.util.Arrays;

/**
 * 31. 下一个排列
 * 实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 * <p>
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 * <p>
 * 必须 原地 修改，只允许使用额外常数空间。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,2,3]
 * 输出：[1,3,2]
 * 示例 2：
 * <p>
 * 输入：nums = [3,2,1]
 * 输出：[1,2,3]
 * 示例 3：
 * <p>
 * 输入：nums = [1,1,5]
 * 输出：[1,5,1]
 * 示例 4：
 * <p>
 * 输入：nums = [1]
 * 输出：[1]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 100
 */
public class NextPermutation31 {
    public static void main(String[] args) {
        final NextPermutation31 nextPermutation31 = new NextPermutation31();
        nextPermutation31.nextPermutation(new int[]{1, 2, 3});
        nextPermutation31.nextPermutation(new int[]{3, 2, 1});
        nextPermutation31.nextPermutation(new int[]{1});

    }

    public void nextPermutation(int[] nums) {
        boolean isSwitch = false;
        int min = Integer.MAX_VALUE;
        for (int i = nums.length - 1; i > 0; i--) {
            if (min > nums[i]) {
                min = nums[i];
            }
            if (min > nums[i - 1]) {
                int p = nums[i - 1];
                nums[i - 1] = nums[i];
                nums[i] = p;
                isSwitch = true;
                break;
            }
        }
        if (!isSwitch) {
            for (int i = 0; i < nums.length / 2; i++) {
                int p = nums[i];
                nums[i] = nums[nums.length - 1 - i];
                nums[nums.length - 1 - i] = p;
            }
        }
    }
}
