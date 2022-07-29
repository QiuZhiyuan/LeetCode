package easy;

import java.util.Arrays;

public class Shuffle1470 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Shuffle1470().shuffle(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 4)));
    }

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int i = 0, j = 0, k = n;

        while (i < result.length) {
            if ((i & 1) == 1) {
                result[i++] = nums[j++];
            } else {
                result[i++] = nums[k++];
            }
        }
        return result;
    }
}
