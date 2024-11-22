package easy;

import common.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Postorder590 {

    public List<Integer> postorder(Node root) {
        return postorder(new ArrayList<>(), root);
    }

    private List<Integer> postorder(List<Integer> list, Node root) {
        if (root != null) {
            list.add(0, root.val);
            for (int i = root.children.size() - 1; i >= 0; i--) {
                postorder(list, root.children.get(i));
            }
        }
        return list;
    }

    public List<Integer> postorderX(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<Node> nodeStack = new Stack<>();
        nodeStack.push(root);
        do {
            final Node node = nodeStack.pop();
            list.add(0, node.val);
            final List<Node> children = node.children;
            if (children != null) {
                for (Node item : children) {
                    nodeStack.push(item);
                }
            }
        } while (!nodeStack.empty());
        return list;
    }
}
