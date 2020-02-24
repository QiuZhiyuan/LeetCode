package easy;

import common.TreeNode;

public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        return root == null || (isBalanced(root.left) && isBalanced(root.left) &&
                Math.abs(depth(root.left) - depth(root.right)) <= 1);
    }

    private int depth(TreeNode root) {
        return root == null ? 0 : Math.max(depth(root.left) + 1, depth(root.right) + 1);
    }
}
