import java.util.ArrayList;
import java.util.List;

/**
 * Created by qiuzhiyuan on 2015/12/1.
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 0) {
            return 0;
        }
        int[] map = new int[triangle.size()];
        int sum = map[0] = triangle.get(0).get(0);

        for (int i = 1; i < triangle.size(); i++) {
            for (int j = triangle.get(i).size() - 1; j >= 0; j--) {
                if (j == 0) {
                    map[j] = map[j] + triangle.get(i).get(j);
                } else if (j == triangle.get(i).size() - 1) {
                    map[j] = map[j - 1] + triangle.get(i).get(j);
                    sum = map[j];
                } else {
                    int min = Math.min(map[j], map[j - 1]);
                    map[j] = triangle.get(i).get(j) + min;
                }
                System.out.println(map[j]);
                if (sum > map[j]) {
                    sum = map[j];
                }
            }
        }
        return sum;
    }
}
