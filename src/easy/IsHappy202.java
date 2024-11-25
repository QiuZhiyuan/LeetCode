package easy;

import common.Node;

import java.util.*;

public class IsHappy202 {

    public static void main(String args[]) {
        System.out.println(new IsHappy202().isHappy(19));
        System.out.println(new IsHappy202().isHappy(2));
        System.out.println(new IsHappy202().isHappy(12));
        System.out.println(new IsHappy202().isHappy(15));
        System.out.println(new IsHappy202().isHappy(100));
        System.out.println(new IsHappy202().isHappy(30));
        System.out.println(new IsHappy202().isHappy(0));
    }

    public boolean isHappy(int n) {
        Set<Integer> results = new LinkedHashSet<>();
        int k, sum;
        while (n != 1) {
            k = n;
            sum = 0;
            while (k != 0) {
                int p = k % 10;
                sum += p * p;
                k /= 10;
            }
            n = sum;
            if (results.contains(sum)) {
                return false;
            } else {
                results.add(sum);
            }
        }
        return true;
    }
}
