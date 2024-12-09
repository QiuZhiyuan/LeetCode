package mid;

import java.util.Arrays;

public class Jump45 {

    public static void main(String args[]) {
        System.out.println(new Jump45().jump(new int[]{2, 2, 3, 1, 1}));// 2
        System.out.println(new Jump45().jump(new int[]{2, 3, 0, 1, 4}));// 2
        System.out.println(new Jump45().jump(new int[]{2, 0, 2, 0, 4}));// 2
        System.out.println(new Jump45().jump(new int[]{1, 3, 0, 1, 0}));// 2
        System.out.println(new Jump45().jump(new int[]{9}));// 2
        System.out.println(new Jump45().jump(new int[]{2, 2, 0, 1, 2, 0, 1, 9}));// 5
    }

    public int jump(int[] nums) {
        int[] count = new int[nums.length];
        count[count.length - 1] = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            int min = Integer.MAX_VALUE;
            count[i] = min - 1;
            for (int j = nums[i]; j > 0; j--) {
                int p = i + j;
                if (p < count.length) {
                    if (min > count[p] + 1) {
                        min = count[p] + 1;
                        count[i] = min;
                    }
                } else {
                    count[i] = 1;
                }
            }
        }
        return count[0];
    }
}
