package easy;

public class IsPowerOfTwo {

    public static void main(String args[]) {
        int n = 2;
        while (n < Integer.MAX_VALUE / 2) {
            n *= 2;
        }
        System.out.print(n);
    }

    public boolean isPowerOfTwo(int n) {
        while ((n & 1) != 1 && n > 0) {
            n = n >> 1;
        }
        return n == 1;
    }
}
