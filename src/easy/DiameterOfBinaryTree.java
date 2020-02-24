package easy;

import common.TreeNode;

public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return maxDepth(root.left) + maxDepth(root.right);
        }
    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(1 + maxDepth(root.left), 1 + maxDepth(root.right));
        }
    }
}
