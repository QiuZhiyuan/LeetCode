package mid;

import java.math.BigInteger;

public class Multiply43 {

    public static void main(String args[]) {
        Multiply43 multiply43 = new Multiply43();
        long num1 = 34452145214663694L;
        long num2 = 0L;
        System.out.println(multiply43.sum(String.valueOf(num1), String.valueOf(num2)));
        System.out.println(num1 + num2);
        System.out.println(Math.pow(10, 5));
        System.out.println(multiply43.multiply(String.valueOf(num1), String.valueOf(num2)));
    }

    public String multiply(String num1, String num2) {
        String result = "0";
        for (int i = num1.length() - 1; i >= 0; i--) {
            int n1 = num1.charAt(i) - 48;
            if (n1 == 0) {
                continue;
            }
            for (int j = num2.length() - 1; j >= 0; j--) {
                int n2 = num2.charAt(j) - 48;
                if (n2 == 0) {
                    continue;
                }
                int p = num1.length() - 1 - i + (num2.length() - 1 - j);
                System.out.println("params:" + n1 + " " + n2 + " " + p);
                String k = n1 * n2 + "0".repeat(Math.max(0, p));
                result = sum(result, k);
            }
        }
        return result;
    }

    private String sum(String num1, String num2) {
        if (num1.length() < num2.length()) {
            String tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        int t = 0;
        StringBuilder sb = new StringBuilder();
        int len = num1.length() - 1;
        for (int i = len; i >= 0; i--) {
            int j = num2.length() - num1.length() + i;
            if (j >= 0) {
                int n1 = num1.charAt(i) - 48;
                int n2 = num2.charAt(j) - 48;
                int tmp = n1 + n2 + t;
                t = tmp / 10;
                sb.insert(0, tmp % 10);
            } else if (t > 0) {
                int tmp = num1.charAt(i) - 48 + t;
                t = tmp / 10;
                sb.insert(0, tmp % 10);
            } else {
                sb.insert(0, num1.substring(0, i + 1));
                return sb.toString();
            }
        }
        if (t > 0) {
            sb.insert(0, t);
        }
        return sb.toString();
    }
}
