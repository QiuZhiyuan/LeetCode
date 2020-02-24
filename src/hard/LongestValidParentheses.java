package hard;

import java.util.Arrays;

public class LongestValidParentheses {
    public int longestValidParenthesesX(String s) {
        int max = 0;
        int[] dp = new int[s.length()];
        Arrays.fill(dp, 0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                int p = i - dp[i - 1] - 1;
                if (p >= 0 && s.charAt(p) == '(') {
                    dp[i] = dp[i - 1] + 2;
                    if (p > 1) {
                        dp[i] += dp[p - 1];
                    }
                }
                if (dp[i]>max){
                    max = dp[i];
                }
            }
        }

        return max;

    }

    public int longestValidParentheses(String s) {
        boolean[] flags = new boolean[s.length()];
        Arrays.fill(flags, false);
        int l = s.length();
        for (int i = 1; i < l; i += 2) {
            for (int j = 0; j + i < l; j++) {
                if (!flags[j] && !flags[j + i] && s.charAt(j) == '(' && s.charAt(j + i) == ')') {
                    boolean flag = true;
                    //如果相连则为合格子串
                    if (i != 1) {
                        //判断不相连时判断内部是否为合格子串
                        for (int k = j + 1; k <= j + i - 1; k++) {
                            if (!flags[k]) {
                                flag = false;
                                break;
                            }
                        }
                    }
                    if (flag) {
                        flags[j] = true;
                        flags[j + i] = true;
                        System.out.println(j + "" + (j + i));
                    }
                }
            }
        }
        int max = 0;
        int n = 0;
        for (int i = 0; i < flags.length; i++) {
            if (flags[i]) {
                n++;
            } else {
                n = 0;
            }
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
}
