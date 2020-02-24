package mid;

import java.util.*;

//589  N叉树的前序遍历
public class Preorder {

    List<Integer> result = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root != null) {
            int val = root.val;
            if (root.children != null) {
                result.add(val);
                for (Node child : root.children) {
                    preorder(child);
                }
            }
        }
        return result;
    }

    public List<Integer> preorderX(Node root) {

        Stack<Node> stack = new Stack<>();
        if (root != null) {
            stack.push(root);
            while (!stack.empty()) {
                Node last = stack.lastElement();
                stack.pop();
                result.add(last.val);
                if (last.children != null) {
                    for (int i = last.children.size() - 1; i >= 0; i--) {
                        stack.push(last.children.get(i));
                    }
                }

            }

        }
        return result;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;
}


