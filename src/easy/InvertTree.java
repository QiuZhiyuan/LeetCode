package easy;

import common.TreeNode;

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode node = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(node);
        }
        return root;
    }
}
