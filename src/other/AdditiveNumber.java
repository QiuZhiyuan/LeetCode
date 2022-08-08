package other;

import java.math.BigInteger;

public class AdditiveNumber {
    public boolean isAdditiveNumber(String num) {
        System.out.println("start:" + num);
        int length = num.length();
        int half_l = num.length() / 2 + 1;

        for (int i = 1; i < half_l; i++) {
            String str0 = num.substring(0, i);
            if (str0.charAt(0) == '0' && str0.length() > 1) {
                continue;
            }
            for (int j = i + 1; j < num.length(); j++) {
                String str2 = num.substring(i, j);
                String str1 = str0;
                if (str2.charAt(0) == '0' && str2.length() > 1) {
                    continue;
                }
                System.out.println("---------");
                //后面取的数字长度
                int k = j;
                while (true) {
                    String sum = add(str1, str2);
                    System.out.println(str1 + "+" + str2+"="+sum);
                    int p = k + sum.length();
                    if (p > length) {
                        break;
                    }
                    String temp = num.substring(k, p);
//                    System.out.println("k,p:"+temp);
                    if (!temp.equals(sum)) {
                        System.out.println("k,p:"+temp+" sum:"+sum);
                        break;
                    }
                    str1 = str2;
                    str2 = sum;
                    k = p;
                    if (k == length) {
                        return true;
                    }
                }

            }
        }
        return false;
    }

    public String add(String num1, String num2) {
//        System.out.print(num1 + "+" + num2 + "=");
        if (num1.equals("")) {
            return num2;
        } else if (num2.equals("")) {
            return num1;
        }
        StringBuffer strSum = new StringBuffer();
        int l1 = num1.length();
        int l2 = num2.length();
        int minL = Math.min(l1, l2);
        //进位
        int carry = 0;
        for (int i = 1; i <= minL; i++) {
            int n1 = num1.charAt(l1 - i) - 48;
            int n2 = num2.charAt(l2 - i) - 48;
            int sum = n1 + n2 + carry;
            if (sum < 10) {
                strSum.insert(0, sum);
                carry = 0;
            } else {
                strSum.insert(0, sum - 10);
                carry = 1;
            }
        }

        //多余的字符串
        String addedStr;

        if (l1 > l2) {
            addedStr = num1.substring(0, l1 - l2);
        } else {
            addedStr = num2.substring(0, l2 - l1);
        }

        if (carry == 1) {
            addedStr = add(addedStr, Integer.toString(carry));
        }
        strSum.insert(0, addedStr);

        return strSum.toString();
    }
}
