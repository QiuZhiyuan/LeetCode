package mid;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int count = 0;
        int d = 1;
        int flag = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == flag) {
                d++;
            } else {
                flag = nums[i];
                d = 1;
            }
            if (d > 2) {
                count++;
            }
            nums[i - count] = nums[i];
        }
        return nums.length - count;
    }
}
