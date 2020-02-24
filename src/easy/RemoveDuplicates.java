package easy;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int d = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i - d] = nums[i];
            if (nums[i + 1] == nums[i]) {
                d++;
            }
        }
        nums[nums.length - 1 - d] = nums[nums.length - 1];
        return nums.length - d;
    }
}
