package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetRow {
    public List<Integer> getRow(int rowIndex) {
        Integer[] result = new Integer[rowIndex + 1];
        for (int i = 0; i <= rowIndex; i++) {
            for (int j = i; j >= 0; j--) {
                if (i == 0 || j == 0 || j == i) {
                    result[j] = 1;
                } else {
                    result[j] = result[j - 1] + result[j];
                }
            }
        }
        return Arrays.asList(result);
    }
}
