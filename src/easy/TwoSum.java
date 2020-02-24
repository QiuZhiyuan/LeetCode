package easy;

public class TwoSum {
    public int[] twoSumI(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int d = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (d == nums[j]) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    return result;
                }
            }
        }
        return result;
    }

    //有序数组
    public int[] twoSumII(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum > target) {
                high--;
            } else if (sum < target) {
                low++;
            } else {
                return new int[]{low + 1, high + 1};
            }
        }
        return null;
    }
}
