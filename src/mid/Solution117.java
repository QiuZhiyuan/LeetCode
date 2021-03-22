package mid;

/**
 * 117.填充每个节点的下一个右侧节点指针 II
 */
public class Solution117 {

    public static void main(String[] args) {

    }

    private static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Node left = connect(root.left);
        Node right = connect(root.right);

        return root;
    }

    public Node deep(Node root, int level) {

    }
}
