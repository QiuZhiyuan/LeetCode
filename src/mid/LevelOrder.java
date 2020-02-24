package mid;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrder(root, result, 0);
        return result;
    }

    private void levelOrder(TreeNode root, List<List<Integer>> result, int level) {
        if (root != null) {
            List<Integer> list;
            if (level < result.size()) {
                list = result.get(level);
            } else {
                list = new ArrayList<>();
                result.add(list);
            }
            list.add(root.val);
            levelOrder(root.left, result, level + 1);
            levelOrder(root.right, result, level + 1);
        }
    }
}
