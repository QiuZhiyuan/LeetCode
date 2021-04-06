package easy;

public class MinCount_LCP_06 {
    public int minCount(int[] coins) {
        int sum = 0;
        for (int n : coins) {
            sum += (n >> 1) + (n & 1);
        }
        return sum;
    }
}
