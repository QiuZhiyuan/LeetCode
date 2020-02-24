package easy;

import java.util.ArrayList;
import java.util.List;

public class Generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> item;
        for (int i = 0; i < numRows; i++) {
            item = new ArrayList<>();
            result.add(item);
            for (int j = 0; j <= i; j++) {
                if (i == 0 || j == 0 || j == i) {
                    item.add(1);
                } else {
                    item.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
        }
        return result;
    }
}
