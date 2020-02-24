package src.easy;

/**
 * 1304. 和为零的N个唯一整数
 */
public class SumZero {

    public int[] sumZero(int n) {
        int[] nums = new int[n];
        int p1 = n / 2 - 1;
        int p2 = n / 2 + 1;
        if (n % 2 == 0) {
            p2--;
        } else {
            nums[n / 2] = 0;
        }
        for (int i = 0; i <= p1; i++) {
            nums[i] = -i - 1;
        }
        for (int i = p2; i < n; i++) {
            nums[i] = n - i;
        }
        return nums;
    }
}
