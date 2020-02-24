package easy;

import java.util.ArrayList;
import java.util.List;

public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int top = nums2.length;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < top; j++) {
                if (nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                    nums2[j] = nums2[top - 1];
                    top--;
                    break;
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
