package easy;

public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j;
        for (int i = 0; i < n; i++) {
            for (j = m + i; j >= 0; j--) {
                if (j <= 0 || nums1[j - 1] < nums2[i]) {
                    break;
                } else {
                    nums1[j] = nums1[j - 1];
                }
            }
            nums1[j] = nums2[i];
        }
    }
}
