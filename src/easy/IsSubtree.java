package easy;

import common.TreeNode;

import java.util.Stack;

public class IsSubtree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s != null) {
            return isSubtree(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
        } else return t == null;
    }

    private boolean isSame(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        } else if (s != null && t != null) {
            if (s.val == t.val) {
                return isSame(s.left, t.left) && isSame(s.right, t.right);
            }
        }
        return false;
    }
}
