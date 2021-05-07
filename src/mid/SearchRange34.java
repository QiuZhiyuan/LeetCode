package mid;

public class SearchRange34 {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        int p = -1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                p = mid;
                break;
            }
        }
        if (p == -1) {
            return new int[]{-1, -1};
        } else {
            left = p;
            right = p;
            while (left >= 0 && nums[left] == target) left--;
            while (right < nums.length && nums[right] == target) right++;
            return new int[]{left + 1, right - 1};
        }
    }
}
