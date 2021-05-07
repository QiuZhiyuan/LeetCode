package mid;

public class Search33 {
    public int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    public int search(int[] nums, int start, int end, int target) {
        System.out.println("start:" + start + " end:" + end);
        if (start == end) {
            if (nums[start] == target) {
                return start;
            } else {
                return -1;
            }
        }
        if (nums[start] < nums[end]) {
            if (target >= nums[start] && target <= nums[end]) {
                while (start <= end) {
                    System.out.println("div start:" + start + " end:" + end);
                    int mid = (start + end) / 2;
                    if (nums[mid] > target) {
                        end = mid - 1;
                    } else if (nums[mid] < target) {
                        start = mid + 1;
                    } else {
                        return mid;
                    }
                }
            }
            return -1;
        } else {
            int mid = (start + end) / 2;
            int left = search(nums, start, mid, target);
            if (left != -1) {
                return left;
            }
            return search(nums, mid + 1, end, target);
        }
    }
}
