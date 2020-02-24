public class L2 {
    public static void main(String args[]) {
        System.out.println(new L2().lengthOfLongestSubstring("abcabfgcbbdfsxcv"));
        System.out.println("abcdefg".substring(1, 3));
    }

    public int lengthOfLongestSubstring(String s) {

        int[] maxLengths = new int[s.length()];
        maxLengths[0] = 1;

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            String subs = s.substring(i - maxLengths[i - 1], i);
            System.out.println(subs + " " + ch);
            boolean flag = true;
            for (int j = 0; j < subs.length(); j++) {
                if (subs.charAt(j) == ch) {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag);
            if (flag) {
                maxLengths[i] = maxLengths[i - 1] + 1;
            } else {
                maxLengths[i] = maxLengths[i - 1];
            }
        }
        int max = 0;
        for (int i = 0; i < maxLengths.length; i++) {
            if (max < maxLengths[i]) {
                max = maxLengths[i];
            }
        }
        return max;
    }
}
