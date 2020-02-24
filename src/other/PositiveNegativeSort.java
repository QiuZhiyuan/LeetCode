package other;

import java.util.Arrays;

/**
 * 有一个整形数组，包含正数和负数，然后要求把数组内的所有负数移至正数的左边，且保证相对位置不变，要求时间复杂度为O(n), 空间复杂度为O(1)。
 * 例如，{10, -2, 5, 8, -4, 2, -3, 7, 12, -88, -23, 35}变化后是{-2, -4，-3, -88, -23,5, 8 ,10, 2, 7, 12, 35}。
 *
 * undone
 */
public class PositiveNegativeSort {

    public static void main(String args[]) {
        System.out.println(Arrays.toString(new PositiveNegativeSort().sort(new int[]{10, -2, 5, 8, -4, 2, -3, 7, 12, -88, -23, 35})));
    }

    private int[] sort(int[] nums) {
        int count = -1;
        for (int num : nums) {
            if (num < 0) {
                count++;
            }
        }
        int i = 0;
        int j = count + 1;
        while (i <= count && j < nums.length) {
            while (i <= count && nums[i] < 0) {
                i++;
            }
            while (j < nums.length && nums[j] >= 0) {
                j++;
            }
            if (i <= count && j < nums.length) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }
}
