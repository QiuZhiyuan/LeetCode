package hard;

import common.TreeNode;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.List;

public class RecoverTree99 {
    public void recoverTree(TreeNode root) {
        search(root);
        for (TreeNode treeNode : nodeList) {
            System.out.println(treeNode.val);
        }
        for (int i = nodeList.size(); i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (nodeList.get(j).val > nodeList.get(j + 1).val) {
                    int v = nodeList.get(j).val;
                    nodeList.get(j).val = nodeList.get(j + 1).val;
                    nodeList.get(j + 1).val = v;
                }
            }
        }
    }

    private void switchNode(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null) {
            return;
        }
        int v = t1.val;
        t1.val = t2.val;
        t2.val = v;
    }

    private TreeNode pre;
    private List<TreeNode> nodeList = new ArrayList<>();

    private void search(TreeNode root) {
        if (root == null) {
            return;
        }
        search(root.left);
//        System.out.println(root.val);
        if (pre != null) {
            if (pre.val > root.val) {
                final TreeNode lastNode = nodeList.size() > 0 ? nodeList.get(nodeList.size() - 1) : null;
                if (!pre.equals(lastNode)) {
                    nodeList.add(pre);
                }
                nodeList.add(root);
            }
        }
        pre = root;
        search(root.right);
    }
}
