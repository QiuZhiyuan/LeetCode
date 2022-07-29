package easy;

public class MinDiffInBST783 {
    //      Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private TreeNode pre;
    private int min;

    public int minDiffInBST(TreeNode root) {
        if (root != null) {
            min = Integer.MAX_VALUE;
            midSearchBTS(root);
        }
        return min;
    }

    private void midSearchBTS(TreeNode root) {
        if (root == null) {
            return;
        }
        midSearchBTS(root.left);
        if (pre != null) {
            int d = root.val - pre.val;
            min = min > d ? d : min;
        }
        pre = root;
        midSearchBTS(root.right);
    }
}
