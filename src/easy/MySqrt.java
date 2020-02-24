package easy;

public class MySqrt {
    public int mySqrt(int x) {
        int last = 0;
        for (int i = 1; i <= x; i++) {
            if (x / i < i) {
                return last;
            } else {
                last = i;
            }
        }
        return x;
    }
}
