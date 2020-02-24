package src.easy;

public class DecompressRLElist {

    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i += 2) {
            len += nums[i];
        }
        int[] result = new int[len];
        len = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                result[len] = nums[i + 1];
                len++;
            }
        }
        return result;
    }
}
