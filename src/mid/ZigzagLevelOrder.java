package mid;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class ZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        zigzagLevelOrder(root, result, 0);
        return result;
    }

    private void zigzagLevelOrder(TreeNode root, List<List<Integer>> result, int level) {
        if (root != null) {
            List<Integer> list;
            if (level < result.size()) {
                list = result.get(level);
            } else {
                list = new ArrayList<>();
                result.add(list);
            }
            if (level % 2 == 1) {
                list.add(0, root.val);
            } else {
                list.add(root.val);
            }
            zigzagLevelOrder(root.left, result, level + 1);
            zigzagLevelOrder(root.right, result, level + 1);
        }
    }
}
