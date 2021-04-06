package easy;

import java.util.List;

public class MaxDepth559 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public int maxDepth(Node root) {
        return maxDepth(0, root);
    }

    private int maxDepth(int depth, Node root) {
        int max = depth;
        if (root != null) {
            max++;
            for (Node node : root.children) {
                int d = maxDepth(depth + 1, node);
                if (d > max) {
                    max = d;
                }
            }
        }
        return max;
    }
}
