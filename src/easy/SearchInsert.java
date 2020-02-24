package easy;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {

        return searchInsert(nums, 0, nums.length - 1, target);
    }

    private int searchInsert(int[] nums, int start, int end, int target) {
        if (nums[start] > target) {
            return start;
        }
        if (nums[end] < target) {
            return end + 1;
        }
        if (start == end) {
            return start;
        }
        int mid = (start + end) / 2;
        int p = nums[mid];
        if (p == target) {
            return mid;
        } else if (p > target) {
            return searchInsert(nums, start, mid - 1, target);
        } else {
            return searchInsert(nums, mid + 1, end, target);
        }
    }
}
