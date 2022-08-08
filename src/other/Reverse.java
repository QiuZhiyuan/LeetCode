package other;

/*
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class Reverse {

    public static void main(String args[]) {
        System.out.println(new Reverse().reverse(-2147483648));
//        System.out.println(new Reverse().reverse(-123));
        System.out.println();
    }

    private double max = Integer.MAX_VALUE;
    private double min = Integer.MIN_VALUE;
    private int length = 1;

    public int reverse(int x) {
        int k = x;
        while (k >= 10 || k <= -10) {
            k = k / 10;
            length++;
        }
//        max = Math.pow(2, 31) - 1;
//        min = Math.pow(-2, 31);
        return (int) reverse(x, 1);
    }

    public double reverse(int x, int n) {
        if (x >= 10 || x <= -10) {
            double p1 = x % 10 * pow(10, length - n);
            double p2 = reverse(x / 10, n + 1);

            if (p1 + p2 > max || p1 + p2 < min) {
                return 0;
            }
            return p1 + p2;
        } else {
            return x;
        }
    }

    public double pow(double a, double b) {
        for (int i = 1; i < b; i++) {
            a = a * 10;
        }
        return a;
    }
}
