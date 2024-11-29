package mid;

import common.TreeNode;

import javax.sound.midi.MidiFileFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalLong;

/**
 * 113. 路径总和 II
 * 中等
 * 相关标签
 * 相关企业
 * <p>
 * 给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
 * <p>
 * 叶子节点 是指没有子节点的节点。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 5
 * 4        8
 * 11      13    4
 * 7  2       5  1
 * 输入：root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
 * 输出：[[5,4,11,2],[5,8,4,5]]
 * <p>
 * 示例 2：
 * <p>
 * 输入：root = [1,2,3], targetSum = 5
 * 输出：[]
 * <p>
 * 示例 3：
 * <p>
 * 输入：root = [1,2], targetSum = 0
 * 输出：[]
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * 树中节点总数在范围 [0, 5000] 内
 * -1000 <= Node.val <= 1000
 * -1000 <= targetSum <= 1000
 */

public class PathSum113 {

    public static void main(String args[]) {
        System.out.println(new PathSum113().pathSum(TreeNode.createBinaryTree(new int[]{5, 4, 8, 11, 0, 13, 4, 7, 2, 0, 0, 5, 1}), 22));
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        final List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        search(root, targetSum, 0, new ArrayList<>(), result);
        return result;
    }

    private void search(TreeNode root, int targetSum, int currentSum, List<Integer> link, List<List<Integer>> result) {
        currentSum += root.val;
        link.add(root.val);
        if (root.left == null && root.right == null && currentSum == targetSum) {
            result.add(new ArrayList<>(link));
        }
        if (root.left != null) {
            search(root.left, targetSum, currentSum, link, result);
        }
        if (root.right != null) {
            search(root.right, targetSum, currentSum, link, result);
        }
        if (!link.isEmpty()) {
            link.remove(link.size() - 1);
        }
    }
}
