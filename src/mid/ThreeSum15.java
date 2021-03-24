package mid;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {
    public static void main(String[] args) {
    }

    public List<List<Integer>> threeSum(int[] nums) {
        int i = 0, j, k;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        final List<List<Integer>> result = new ArrayList<>();
        while (i < nums.length) {
            j = i + 1;
            k = nums.length - 1;
            while (j < k) {
                if (nums[j] + nums[k] > -nums[i]) {
                    k--;
                } else if (nums[j] + nums[k] < -nums[i]) {
                    j++;
                } else {
                    final List<Integer> item = new ArrayList<>();
                    item.add(nums[i]);
                    item.add(nums[j]);
                    item.add(nums[k]);
                    result.add(item);
                    while (j < nums.length - 1 && nums[j + 1] == nums[j]) j++;
                    j++;
                    while (k > 0 && nums[k - 1] == nums[k]) k--;
                    k--;
                }
            }
            while (i < nums.length - 1 && nums[i + 1] == nums[i]) i++;
            i++;
        }
        return result;
    }
}
