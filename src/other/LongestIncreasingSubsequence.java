package other;

/**
 *
 * @author Administrator
 *
 */
public class LongestIncreasingSubsequence {

	public int lengthOfLIS(int nums[]) {

		if (nums.length == 0) {
			return 0;
		}
		int[] a = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			a[i] = 1;
		}
		for (int i = 0; i < nums.length; i++) {
			int max = 1;
			for (int j = 0; j < i; j++) {
				if (nums[j] < nums[i]) {
					max = Math.max(a[j] + 1, max);
				}
			}
			a[i] = max;
		}
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			max = Math.max(a[i], max);
		}
		return max;
	}
}
