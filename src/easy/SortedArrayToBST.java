package easy;

import common.TreeNode;

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start == end) {
            return new TreeNode(nums[start]);
        } else if (start < end) {
            int mid = (start + end) >> 1;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = sortedArrayToBST(nums, start, mid - 1);
            node.right = sortedArrayToBST(nums, mid + 1, end);
            return node;
        }
        return null;
    }
}
