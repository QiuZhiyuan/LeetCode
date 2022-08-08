package other.test;


import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Test().fun(12344321));
    }

    public boolean fun(int num) {
        int p = num;
        List<Integer> numList = new ArrayList<>();
        while (p > 0) {
            numList.add(p % 10);
            p = p / 10;
        }
        int left = 0, right = numList.size() - 1;
        while (left < right && numList.get(left).equals(numList.get(right))) {
            left++;
            right--;
        }
        return left >= right;
    }
}
