package common;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    /**
     * Item in nums is 0 or negative number means null
     *
     * @param nums
     * @return
     */
    public static TreeNode createBinaryTree(int[] nums) {
        return createBinaryTree(nums, 0);
    }

    public static TreeNode createBinaryTree(int[] nums, int root) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        if (root >= nums.length || nums[root] <= 0) {
            return null;
        }
        final TreeNode node = new TreeNode(nums[root]);
        node.left = createBinaryTree(nums, root * 2 + 1);
        node.right = createBinaryTree(nums, root * 2 + 2);
        return node;
    }
}