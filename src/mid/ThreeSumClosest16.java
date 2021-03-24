package mid;

import java.util.Arrays;
import java.util.Map;

public class ThreeSumClosest16 {
    
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int i, j, k;
        int result = target;
        i = 0;
        while (i < nums.length) {
            j = i + 1;
            k = nums.length - 1;
            while (j < k) {
                final int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(sum - target) < min) {
                    min = Math.abs(sum - target);
                    result = sum;
                }
                if (sum > target) {
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    return sum;
                }
            }
            while (i < nums.length - 1 && nums[i + 1] == nums[i]) i++;
            i++;
        }
        return result;
    }
}
