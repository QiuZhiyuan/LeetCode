package hard;

public class FirstMissingPositive {

    public static void main(String args[]) {
        System.out.print(new FirstMissingPositive().firstMissingPositiveX(new int[]{3, 4, -1, 1}));
    }

    public int firstMissingPositive(int[] nums) {

        boolean[] flags = new boolean[nums.length];
        for (int i = 0; i < flags.length; i++) {
            flags[i] = false;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= nums.length && nums[i] > 0) {
                flags[nums[i] - 1] = true;
            }
        }
        for (int i = 0; i < flags.length; i++) {
            if (!flags[i]) {
                return i + 1;
            }
        }
        return flags.length + 1;
    }

    public int firstMissingPositiveX(int[] nums) {
        int n = nums.length;
        for (int x : nums)
            while (x > 0 && x < n && nums[x - 1] != x) {
                int temp = nums[x - 1];
                nums[x - 1] = x;
                x = temp;
            }
        ;
        for (int i = 0; i < n; ++i)
            if (nums[i] != i + 1) return i + 1;
        return n + 1;
    }


}
