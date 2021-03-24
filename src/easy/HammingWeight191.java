package easy;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class HammingWeight191 {

    public static void main(String[] args) {
        System.out.println(new HammingWeight191().hammingWeight(3));
    }

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int i = 0;
        int count = 0;
        while (i < 32) {
            count += n & 1;
            n = n >> 1;
            i++;
        }
        return count;
    }
}
