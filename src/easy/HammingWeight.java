package easy;

public class HammingWeight {

    public static void main(String args[]) {
        System.out.print(-3 >> 1);
    }

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >>> 1;
        }
        return count;
    }
}
