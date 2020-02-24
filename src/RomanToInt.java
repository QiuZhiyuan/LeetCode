public class RomanToInt {
    public static void main(String args[]) {
        System.out.println(new RomanToInt().romanToInt("MCMXCIV"));
    }

    private int romanToInt(String s) {
        final char defaultCh = '-';
        int x = 0;
        char lastCh = defaultCh;
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            switch (ch) {
                case 'I':
                    x = x + 1;
                    lastCh = 'I';
                    break;
                case 'V':
                    if (lastCh == 'I') {
                        x = x - 2;
                        lastCh = defaultCh;
                    }
                    x = x + 5;
                    break;
                case 'X':
                    if (lastCh == 'I') {
                        x = x - 2;
                    } else {
                        lastCh = 'X';
                    }
                    x = x + 10;
                    break;
                case 'L':
                    if (lastCh == 'X') {
                        x = x - 20;
                        lastCh = defaultCh;
                    }
                    x = x + 50;
                    break;
                case 'C':
                    if (lastCh == 'X') {
                        x = x - 20;
                        lastCh = defaultCh;
                    } else {
                        lastCh = 'C';
                    }
                    x = x + 100;
                    break;
                case 'D':
                    if (lastCh == 'C') {
                        x = x - 200;
                        lastCh = defaultCh;
                    }
                    x = x + 500;
                    break;
                case 'M':
                    if (lastCh == 'C') {
                        x = x - 200;
                        lastCh = defaultCh;
                    } else {
                        lastCh = 'M';
                    }
                    x = x + 1000;
                default:
            }
        }
        return x;
    }
}


/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/roman-to-integer
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
* */