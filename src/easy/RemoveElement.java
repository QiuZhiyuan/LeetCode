package easy;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int d = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i - d] = nums[i];
            if (val == nums[i]) {
                d++;
            }
        }
        return nums.length - d;
    }
}
