package easy;

public class SortString {
    public String sortString(String s) {
        int[] ch = new int[26];
        for (int i = 0; i < ch.length; i++) {
            ch[0] = 0;
        }
        for (int i = 0; i < s.length(); i++) {
            ch[s.charAt(i) - 97]++;
        }
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] > 0) {
                    flag = true;
                    sb.append((char) (i + 97));
                    ch[i]--;
                }
            }
            for (int i = ch.length - 1; i >= 0; i--) {
                if (ch[i] > 0) {
                    flag = true;
                    sb.append((char) (i + 97));
                    ch[i]--;
                }
            }
        }
        return sb.toString();
    }
}
