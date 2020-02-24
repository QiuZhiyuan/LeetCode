package mid;

public class StrStr {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.equals("")) {
            return 0;
        }
        if (haystack == null || haystack.equals("")) {
            return -1;
        }
        char ch = needle.charAt(0);
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == ch) {
                boolean flag = true;
                for (int j = 1; j < needle.length(); j++) {
                    if (i + j > haystack.length() || haystack.charAt(i + j) != needle.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return i;
                }
            }
        }
        haystack.indexOf(needle);
        return -1;
    }
}
