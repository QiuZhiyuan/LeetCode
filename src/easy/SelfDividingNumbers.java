package easy;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        String str;
        for (int i = left; i <= right; i++) {
            str = String.valueOf(i);
            boolean flag = true;
            for (int j = 0; j < str.length(); j++) {
                int p = str.charAt(j) - '0';
                if (p == 0 || i % p != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.add(i);
            }
        }
        return result;
    }
}
