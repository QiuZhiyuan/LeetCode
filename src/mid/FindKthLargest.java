package mid;

public class FindKthLargest {
    public static void main(String args[]) {
        System.out.println(new FindKthLargest().findKthLargest(new int[]{1, 3, 2, 1}, 4));
    }

    public int findKthLargest(int[] nums, int k) {
        return findKthLargest(0, nums.length - 1, nums, k - 1);
    }

    private int findKthLargest(int start, int end, int[] nums, int k) {
        if (start < end) {
            int index = getIndex(start, end, nums);
            if (index == k) {
                return nums[index];
            } else if (index < k) {
                return findKthLargest(index + 1, end, nums, k);
            } else {
                return findKthLargest(start, index - 1, nums, k);
            }
        } else {
            return nums[start];
        }
    }

    private int getIndex(int start, int end, int[] nums) {
        int temp = nums[start];
        while (start < end) {
            while (nums[end] <= temp && start < end) {
                end--;
            }
            nums[start] = nums[end];
            while (nums[start] >= temp && start < end) {
                start++;
            }
            nums[end] = nums[start];

        }
        nums[start] = temp;
        return start;
    }
}
