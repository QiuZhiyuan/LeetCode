package easy;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrderBottom(root, result, 0);
        return result;
    }

    private void levelOrderBottom(TreeNode root, List<List<Integer>> result, int level) {
        if (root != null) {
            List<Integer> list;
            if (result.size() > 0 && level < result.size()) {
                list = result.get(result.size() - 1 - level);
            } else {
                list = new ArrayList<>();
                result.add(0, list);
            }
            list.add(root.val);
            levelOrderBottom(root.left, result, level + 1);
            levelOrderBottom(root.right, result, level + 1);
        }
    }
}
