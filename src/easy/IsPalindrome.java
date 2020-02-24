package easy;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        String str = replaceStr(s);
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);
            if (ch1 != ch2) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private String replaceStr(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append(ch);
            }
            if (ch >= 'A' && ch <= 'Z') {
                sb.append(Character.toLowerCase(ch));
            }
            if (ch >= '0' && ch <= '9') {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
