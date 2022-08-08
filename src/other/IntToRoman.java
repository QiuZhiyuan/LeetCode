package other;

public class IntToRoman {

    public static void main(String args[]) {
        System.out.println(new IntToRoman().intToRoman1(1994));
    }

    private String intToRoman(int num) {

        char[] keys = new char[]{'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        int[] values = new int[]{1000, 500, 100, 50, 10, 5, 1};

        int d;
        int t;

        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (num > 0) {
            t = values[i];
            d = num / t;
            if (d > 0) {
                if (d < 4) {
                    for (int j = 0; j < d; j++) {
                        sb.append(keys[i]);
                    }
                } else if (i > 0) {
                    sb.append(keys[i]);
                    sb.append(keys[i - 1]);
                }
            } else {
                if (i % 2 == 0 && i + 2 < values.length) {
                    int temp = values[i] - values[i + 2];
                    if (num < values[i] && num >= temp) {
                        t = temp;
                        sb.append(keys[i + 2]);
                        sb.append(keys[i]);
                    }
                }
                i++;
            }
            num = num % t;
        }

        return sb.toString();
    }

    private String intToRoman1(int num) {
        String[] keys = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int d;
        while (num > 0) {
            d = num / values[i];
            if (d > 0) {
                for (int j = 0; j < d; j++) {
                    sb.append(keys[i]);
                }
                num = num % values[i];
            }
            i++;
        }
        return sb.toString();
    }
}

/*
* I             1
V             5
X             10
L             50
C             100
D             500
M             1000

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/integer-to-roman
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/