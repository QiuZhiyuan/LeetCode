package easy;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        boolean isCarry = false;
        int p = 0;
        while (p < a.length() || p < b.length()) {
            int p1 = a.length() - 1 - p;
            int p2 = b.length() - 1 - p;
            int ch1 = '0', ch2 = '0';
            if (p1 < a.length() && p1 >= 0) {
                ch1 = a.charAt(p1);
            }
            if (p2 < b.length() && p2 >= 0) {
                ch2 = b.charAt(p2);
            }
            switch (ch1 + ch2) {
                case '1' + '0':
                    if (isCarry) {
                        sb.insert(0, '0');
                    } else {
                        sb.insert(0, '1');
                    }
                    break;
                case '0' + '0':
                    if (isCarry) {
                        sb.insert(0, '1');
                        isCarry = false;
                    } else {
                        sb.insert(0, '0');
                    }
                    break;
                case '1' + '1':
                    if (isCarry) {
                        sb.insert(0, '1');
                    } else {
                        sb.insert(0, '0');
                        isCarry = true;
                    }
                default:
                    break;
            }
            p++;
        }
        if (isCarry) {
            sb.insert(0, '1');
        }
        return sb.toString();
    }
}
