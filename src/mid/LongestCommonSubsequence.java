package mid;

import java.util.Arrays;

public class LongestCommonSubsequence {

    private volatile static LongestCommonSubsequence instance;

    public static LongestCommonSubsequence getInstance() {

        if (instance == null) {
            synchronized (LongestCommonSubsequence.class) {
                if (instance == null) {
                    instance = new LongestCommonSubsequence();
                }
            }
        }
        return instance;
    }


    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        Arrays.fill(dp, 0);
        if (text1.charAt(0) == text2.charAt(0)) {
            dp[0][0] = 1;
        }
        for (int i = 1; i < text1.length(); i++) {
            dp[i][0] = dp[i - 1][0];
            for (int j = 1; j < text2.length(); j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = dp[i][j - 1] + 1;
                    break;
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[text1.length() - 1][text2.length() - 1];
    }
}
