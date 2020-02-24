package easy;

public class ValidPalindrome {
    public boolean validPalindrome(String s) {
        if (s.length() <= 2) {
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        boolean flag = false;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                if (!flag) {
                    if (s.charAt(i + 1) == s.charAt(j)) {
                        i++;
                    } else if (s.charAt(i) == s.charAt(j - 1)) {
                        j--;
                    } else {
                        return false;
                    }
                    flag = true;
                } else {
                    return false;
                }
            }
            i++;
            j--;
        }
        return true;
    }
}
