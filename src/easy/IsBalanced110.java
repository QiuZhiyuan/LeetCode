package easy;

import common.TreeNode;

public class IsBalanced110 {
    public boolean isBalanced(TreeNode root) {
        return depth(root) >= 0;
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int dl = depth(root.left);
        int dr = depth(root.right);
        if (dl >= 0 && dr >= 0 && Math.abs(dl - dr) <= 1) {
            return Math.max(dl, dr) + 1;
        } else {
            return -1;
        }
    }
}
