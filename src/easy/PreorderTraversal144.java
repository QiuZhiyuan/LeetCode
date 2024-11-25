package easy;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal144 {

    public static void main(String args[]) {
        System.out.println("Hello World");
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(new PreorderTraversal144().preorderTraversal(root));
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        final List<Integer> list = new ArrayList<>();
        traversal(root, list);
        return list;
    }

    private void traversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        if (root.left != null) {
            traversal(root.left, list);
        }
        if (root.right != null) {
            traversal(root.right, list);
        }
    }
}