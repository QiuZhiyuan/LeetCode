package common;

import java.util.List;

public class Node {
    public int val;
    public List<Node> neighbors;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
        children = _neighbors;
    }
};