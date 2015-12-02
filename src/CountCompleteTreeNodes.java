import java.util.ArrayList;
import java.util.List;

/**
 * Created by qiuzhiyuan on 2015/12/2.
 *
 * 该方法超时
 */
public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {

        if (root == null) {
            return 0;
        }
        TreeNode xroot = root;
        while (xroot.left != null) {
            xroot = xroot.left;
            maxLevel++;
        }

        move(root, 1);
        return (int) (Math.pow(2, maxLevel - 1) - 1 + lastLevelCount);
    }

    private int maxLevel = 1;

    private int lastLevelCount = 0;

    private boolean flag = true;

    private void move(TreeNode root, int level) {
        if (root == null || !flag) {
            return;
        }

        if (level >= maxLevel - 1) {
            if (root.left != null) {
                lastLevelCount++;
                if (root.right != null) {
                    lastLevelCount++;
                } else {
                    flag = false;
                }
            }
        } else {
            move(root.left, level + 1);
            move(root.right, level + 1);
        }
    }

}
