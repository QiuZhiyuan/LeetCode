package easy;

import common.TreeNode;

public class MinDepth {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else {
            int dleft = (root.left == null ? Integer.MAX_VALUE : minDepth(root.left) + 1);
            int dright = (root.right == null ? Integer.MAX_VALUE : minDepth(root.right) + 1);
            return Math.min(dleft, dright);
        }
    }
}
