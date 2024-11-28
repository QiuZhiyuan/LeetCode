package easy;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal144 {

    public static void main(String args[]) {
        System.out.println("Hello World");
        System.out.println(new PreorderTraversal144().preorderTraversal(TreeNode.createBinaryTree(new int[]{1, 2, 3, 0, 4, 6, 5}, 0)));
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
