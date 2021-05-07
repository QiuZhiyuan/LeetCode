package mid;

import common.TreeNode;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class IsValidBST98 {
    public boolean isValidBST(TreeNode root) {
        searchBTS(root);
        return result;
    }

    private TreeNode pre;
    private boolean result = true;

    public void searchBTS(TreeNode root) {
        if (root == null) {
            return;
        }
        searchBTS(root.left);
        if (pre != null && result) {
            result = pre.val < root.val;
        }
        System.out.println((pre == null ? "null" : pre.val) +" "+ root.val);
        pre = root;
        searchBTS(root.right);
    }
}
