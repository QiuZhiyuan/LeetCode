package mid;

public class LongestPalindrome {
    public static void main(String args[]) {
        System.out.println(new LongestPalindrome().longestPalindrome("bbbbb"));
    }

    //暴力搜索
    public String longestPalindrome(String s) {
        if (s.length() == 0) {
            return s;
        }
        int max = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int p;
            int q;
            p = i - 1;
            q = i + 1;
            while (p >= 0 && q < s.length()) {
                if (s.charAt(p) == s.charAt(q)) {
                    if (q - p > max) {
                        start = p;
                        end = q;
                        max = q - p;
                    }
                } else {
                    break;
                }
                p--;
                q++;
            }
            p = i;
            q = i + 1;
            while (p >= 0 && q < s.length()) {
                if (s.charAt(p) == s.charAt(q)) {
                    if (q - p > max) {
                        start = p;
                        end = q;
                        max = q - p;
                    }
                } else {
                    break;
                }
                p--;
                q++;
            }
        }
        return s.substring(start, end + 1);
    }
}
