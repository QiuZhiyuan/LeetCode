package mid;

import java.util.Arrays;

public class Jump45 {

    public static void main(String args[]) {
        System.out.println(new Jump45().jump(new int[]{2, 2, 3, 1, 1}));// 2
        System.out.println(new Jump45().jump(new int[]{2, 3, 0, 1, 4}));// 2
        System.out.println(new Jump45().jump(new int[]{2, 0, 2, 0, 4}));// 2
        System.out.println(new Jump45().jump(new int[]{1, 3, 0, 1, 0}));// 2
        System.out.println(new Jump45().jump(new int[]{9}));// 0
        System.out.println(new Jump45().jump(new int[]{2, 2, 0, 1, 2, 0, 1, 9}));// 5
        System.out.println(new Jump45().jump(new int[]{1, 1, 1, 1, 1, 1, 1}));// 6
    }

    public int jump(int[] nums) {
        int flag = 100000;
        for (int i = nums.length - 2; i >= 0; i--) {
            int min = 10000;
            nums[i] = min * flag + nums[i];
            for (int j = nums[i] % flag; j > 0; j--) {
                int p = i + j;
                if (p < nums.length) {
                    if (min > nums[p] / flag + 1) {
                        min = nums[p] / flag + 1;
                        nums[i] = min * flag + nums[i] % flag;
                    }
                } else {
                    nums[i] = flag + nums[i] % flag;
                }
            }
        }
        return nums[0] / flag;
    }
}
