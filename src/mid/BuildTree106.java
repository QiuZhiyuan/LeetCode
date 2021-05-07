package mid;

import common.TreeNode;

public class BuildTree106 {
    private int top;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        top = inorder.length - 1;
        return buildTree(inorder, postorder, 0, inorder.length);
    }

    private TreeNode buildTree(int[] inorder, int[] postorder, int start, int end) {
        if (top < 0) {
            return null;
        }
        int val = postorder[top];
        int p = -1;
        for (int i = start; i < end; i++) {
            if (inorder[i] == val) {
                p = i;
            }
        }
        if (p == -1) {
            return null;
        }
        final TreeNode node = new TreeNode(val);
        top--;
        node.right = buildTree(inorder, postorder, p + 1, end);
        node.left = buildTree(inorder, postorder, start, p);
        return node;
    }
}
