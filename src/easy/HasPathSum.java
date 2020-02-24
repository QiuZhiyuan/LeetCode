package easy;

import common.TreeNode;

public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        } else {
            if (root.left == null && root.right == null) {
                return sum - root.val == 0;
            } else {
                return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
            }
        }
    }
}
