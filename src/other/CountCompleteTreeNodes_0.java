package other;

import common.TreeNode;

/**
 * Created by qiuzhiyuan on 2015/12/2.
 * <p/>
 * 尝试用二分法解决
 */
public class CountCompleteTreeNodes_0 {

    int maxLevel = 1;

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        TreeNode xroot = root;
        maxLevel = 1;
        while (xroot.left != null) {
            xroot = xroot.left;
            maxLevel++;
        }
        int left = 0;
        int right = maxLevel -1;

        return 0;

    }

    private int move(TreeNode root, int path, int left, int right) {
        System.out.println("path:"+path+" left:"+left+" right:"+right);
        int mid = (left + right) / 2;

        for (int i = left; i < mid; i++) {
            root = root.left;
        }
        for (int i = mid; i < right; i++) {
            root = root.right;
        }
        return 0;
    }
}
