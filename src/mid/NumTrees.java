package mid;

public class NumTrees {
    public int numTrees(int n) {
        return dp(n);
    }

    private int dp(int n) {
        switch (n) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            default: {
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                    sum += (dp(i - 1) * dp(n - i));
                }
                return sum;
            }
        }
    }

    public int numTreesX(int n) {
        if (n < 3) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }
}
