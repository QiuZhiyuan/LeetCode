package mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        combinationSum(result, null, candidates, target, 0);
        return result;
    }

    private void combinationSum(List<List<Integer>> result, List<Integer> list, int[] candidates, int target, int itemTop) {
        if (list == null) {
            list = new ArrayList<>();
        }
        for (int i = itemTop; i < candidates.length; i++) {
            int d = target - candidates[i];
            if (d == 0) {
                list.add(candidates[i]);
                result.add(new ArrayList<>(list));
                list.remove(list.size() - 1);
            } else if (d > 0) {
                list.add(candidates[i]);
                combinationSum(result, list, candidates, d, i);
                list.remove(list.size() - 1);
            }
        }
    }
}
