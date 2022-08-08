package other;

public class LongestCommonPrefix {

    public static void main(String args[]) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"lex", "ledccd", "wsc"}));
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if (strs.length > 0) {
            for (int i = 0; i < strs[0].length(); i++) {
                char ch = strs[0].charAt(i);
                for (int j = 1; j < strs.length; j++) {
                    if (!(i < strs[j].length() && strs[j].charAt(i) == ch)) {
                        return sb.toString();
                    }
                }
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
