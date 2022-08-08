package mid;

/**
 * 给定两个整数，被除数dividend和除数divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 * <p>
 * 返回被除数dividend除以除数divisor得到的商。
 * <p>
 * 整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8 以及 truncate(-2.7335) = -2
 * <p>
 * <p>
 * <p>
 * 示例1:
 * <p>
 * 输入: dividend = 10, divisor = 3
 * 输出: 3
 * 解释: 10/3 = truncate(3.33333..) = truncate(3) = 3
 * 示例2:
 * <p>
 * 输入: dividend = 7, divisor = -3
 * 输出: -2
 * 解释: 7/-3 = truncate(-2.33333..) = -2
 * <p>
 * <p>
 * 提示：
 * <p>
 * 被除数和除数均为 32 位有符号整数。
 * 除数不为0。
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231, 231− 1]。本题中，如果除法结果溢出，则返回 231− 1。
 */
public class Division29 {
    public static void main(String[] args) {
        final Division29 division29 = new Division29();
//        System.out.println(division29.divide(10, -1));
        System.out.println(division29.divide(-2147483648, 2));

    }

    public int divide(int dividend, int divisor) {
        if (dividend == -2147483648 && divisor == -1) {
            return 2147483647;
        }
        boolean positive = (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0);
        long t = dividend;
        long p = divisor;
        if (t < 0) {
            t = -t;
        }
        if (p < 0) {
            p = -p;
        }
        int bit = 0;
        long sum;
        int result;
        do {
            bit++;
            result = 1 << bit;
            sum = p << bit;
        } while (sum < t);
        while (sum > t) {
            result--;
            sum = sum - p;
        }
        return positive ? result : -result;
    }
}
