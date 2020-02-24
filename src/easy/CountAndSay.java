package easy;

public class CountAndSay {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        sb.append("1");
        for (int i = 2; i <= n; i++) {
            int top = 0;
            int count = 1;
            char ch;
            if (temp.length() > 0) {
                temp.delete(0, temp.length());
            }
            while (top < sb.length()) {
                ch = sb.charAt(top);
                if (top + 1 == sb.length() || ch != sb.charAt(top + 1)) {
                    temp.append(count);
                    temp.append(ch);
                    count = 1;
                } else {
                    count++;
                }
                top++;
            }
            sb = temp;
        }
        return sb.toString();
    }
}
