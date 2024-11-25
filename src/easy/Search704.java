package easy;

public class Search704 {

    public static void main(String args[]) {
        int[] nums = new int[]{2,5,6,7,8,9};
        int target = 9;
        System.out.println(new Search704().search(nums, target));
    }

    public int search(int[] nums, int target) {
        int p = 0, q = nums.length - 1, k;
        while (p < q) {
            k = (p + q) / 2;
            if (nums[k] == target) {
                return k;
            } else if (nums[k] > target) {
                q = k - 1;
            } else {
                p = k + 1;
            }
        }
        return nums[p] == target ? p : -1;
    }
}
