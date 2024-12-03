package mid;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 129. 求根节点到叶节点数字之和
 * 给你一个二叉树的根节点 root ，树中每个节点都存放有一个 0 到 9 之间的数字。
 * <p>
 * 每条从根节点到叶节点的路径都代表一个数字：
 * <p>
 * 例如，从根节点到叶节点的路径 1 -> 2 -> 3 表示数字 123 。
 * <p>
 * 计算从根节点到叶节点生成的 所有数字之和 。
 * <p>
 * 叶节点 是指没有子节点的节点。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：root = [1,2,3]
 * 输出：25
 * 解释：
 * 从根到叶子节点路径 1->2 代表数字 12
 * 从根到叶子节点路径 1->3 代表数字 13
 * 因此，数字总和 = 12 + 13 = 25
 * <p>
 * 示例 2：
 * <p>
 * 输入：root = [4,9,0,5,1]
 * 输出：1026
 * 解释：
 * 从根到叶子节点路径 4->9->5 代表数字 495
 * 从根到叶子节点路径 4->9->1 代表数字 491
 * 从根到叶子节点路径 4->0 代表数字 40
 * 因此，数字总和 = 495 + 491 + 40 = 1026
 */
public class SumNumbers129 {
    private int mSum;

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        createNumbers(root, new ArrayList<>());
        return mSum;
    }

    public void createNumbers(TreeNode root, List<Integer> values) {
        values.add(root.val);
        if (root.left == null && root.right == null) {
            for (int i = 0; i < values.size(); i++) {
                int p = 1;
                for (int j = values.size() - 1 - i; j > 0; j--) {
                    p *= 10;
                }
                mSum += p * values.get(i);
            }
        }
        if (root.left != null) {
            createNumbers(root.left, values);
        }
        if (root.right != null) {
            createNumbers(root.right, values);
        }
        values.remove(values.size() - 1);
    }
}
