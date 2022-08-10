package leetcode2022;

/*
Given a string s, find the length of the longest substring without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Constraints:

    0 <= s.length <= 5 * 10^4
    s consists of English letters, digits, symbols and spaces.


 */

import common.Tools;

import java.util.Arrays;
import java.util.HashSet;

public class P03_LengthOfLongestSubstring {

    public static void main(String args[]) {
        P03_LengthOfLongestSubstring obj = new P03_LengthOfLongestSubstring();
        Tools.println(obj.lengthOfLongestSubstring("abcbccdfgabcdefghijklmnopqrstuvwxyz"));
        Tools.println(obj.lengthOfLongestSubstring("zzzaaacccxxsss"));
        Tools.println(obj.lengthOfLongestSubstring("aabbccx"));
        Tools.println(obj.lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyz"));
        Tools.println(obj.lengthOfLongestSubstring("aabb"));
        Tools.println(obj.lengthOfLongestSubstring("zzzxcvbbbccsss"));
        Tools.println(obj.lengthOfLongestSubstring("z"));
        Tools.println(obj.lengthOfLongestSubstring(""));
        Tools.println(obj.lengthOfLongestSubstring("abccdfghjjddffeerrtt"));
//        Tools.println(obj.lengthOfLongestSubstring("abcabcbbagabaensrhrsthytjtthtry'jyruiolszgaqfe'gbfgngmyujhrbmdty")); //14
        Tools.println(obj.lengthOfLongestSubstring("abcabcbbagabaensrhrsthytjtthtryjyruiolszgaqfegbfgngmyujhrbmdty")); //14
        Tools.println(obj.lengthOfLongestSubstring("abcbacdc")); // 4
        Tools.println(obj.lengthOfLongestSubstring(" ~!@#$%^&*()_+1234567890asvbjtrc")); //
        Tools.println(obj.lengthOfLongestSubstring("efa23131~!@$%@!%&&**we3 423fq43tw40-=-=-90897rjtywfaefawfwaf w wefaw wef```~a wefawefawea wgaergagbthrtjyu5676212~eqdwega dfsg hsrgsergaef")); //12
    }

    // TODO accepted faster
    public int lengthOfLongestSubstring(String s) {
        boolean[] chSet = new boolean[95];
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            Arrays.fill(chSet, false);
            int ch0 = s.charAt(i) - ' ';
            chSet[ch0] = true;
            int count = 1;
            for (int j = i - 1; j >= 0; j--) {
                int ch1 = s.charAt(j) - ' ';
                if (chSet[ch1]) {
                    break;
                } else {
                    count++;
                }
                chSet[ch1] = true;
            }
            if (max < count) {
                max = count;
            }
        }
        return max;
    }

    // TODO accepted
//    public int lengthOfLongestSubstring(String s) {
//        HashSet<Character> chSet = new HashSet<>();
//        int max = 0;
//        for (int i = 0; i < s.length(); i++) {
//            chSet.clear();
//            chSet.add(s.charAt(i));
//            int count = 1;
//            for (int j = i - 1; j >= 0; j--) {
//                if (chSet.contains(s.charAt(j))) {
//                    break;
//                } else {
//                    count++;
//                }
//                chSet.add(s.charAt(j));
//            }
//            if (max < count) {
//                max = count;
//            }
//        }
//        return max;
//    }
}
