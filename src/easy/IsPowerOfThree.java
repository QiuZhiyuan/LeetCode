package easy;

public class IsPowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }
        int p = 3;
        int x = -1;
        while (p < n && p <= Integer.MAX_VALUE / p) {
            x = p;
            p *= p;
        }
        while (x < n && p > n) {
            x *= 3;
        }
        while (p < n) {
            p *= 3;
        }
        return p == n || x == n;
    }
}
