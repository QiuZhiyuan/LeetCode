package src.easy;

import java.util.Stack;

/**
 * 628. 三个数的最大乘积
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 */
public class MaximumProduct {

    public static void main(String args[]) {
        int[] arr = {10,2,1,2,3,4,5,6,7,1,};
        System.out.println(new MaximumProduct().maximumProduct(arr));
    }

    public int maximumProduct(int[] nums) {
        int[] max = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        int[] min = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        for (int n : nums) {
            if (n > max[0]) {
                max[2] = max[1];
                max[1] = max[0];
                max[0] = n;
            } else if (n > max[1]) {
                max[2] = max[1];
                max[1] = n;
            } else if (n > max[2]) {
                max[2] = n;
            }
            if (n < min[0]) {
                min[1] = min[0];
                min[0] = n;
            } else if (n < min[1]) {
                min[1] = n;
            }
        }

        int num1, num2;
        num1 = min[0] * min[1] * max[0];
        num2 = max[0] * max[1] * max[2];
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
