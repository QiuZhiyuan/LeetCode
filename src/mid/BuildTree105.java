package mid;

import common.TreeNode;

public class BuildTree105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, preorder.length);
    }

    private int top = 0;

    private TreeNode buildTree(int[] preorder, int[] inorder, int start, int end) {
        System.out.println(top + " " + start + " " + end);
        if (top >= preorder.length) {
            return null;
        }
        int val = preorder[top];
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
        top++;
        node.left = buildTree(preorder, inorder, start, p);
        node.right = buildTree(preorder, inorder, p + 1, end);
        return node;
    }
}
