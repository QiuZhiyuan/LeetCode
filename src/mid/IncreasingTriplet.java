package mid;

public class IncreasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int min = nums[0];
        int mid = 0;
        boolean isMid = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) {
                if (isMid) {
                    if (nums[i] > mid) {
                        return true;
                    } else {
                        mid = nums[i];
                    }
                } else {
                    mid = nums[i];
                    isMid = true;
                }
            } else {
                min = nums[i];
            }
        }
        return false;
    }
}
