package mid;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLongestSubstring {
    public static void main(String args[]) {
        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring(""));
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1 || s.length() == 0) {
            return s.length();
        }
        int start = 0, max = 0;
        for (int i = 1; i < s.length(); i++) {
            for (int j = i - 1; j >= start; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    start = j + 1;
                    break;
                }
            }
            if (i - start + 1 > max) {
                max = i - start + 1;
            }
            System.out.println(i + " " + start);
        }
        return max;
    }
}
