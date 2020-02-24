package mid;

import common.Node;

import java.util.*;

public class CloneGraph {
    public Node cloneGraph(Node node) {
        Node head = new Node(node.val, new ArrayList<>());
        Node nodeP;
        Stack<Node> nodeStack = new Stack<>();
        nodeStack.push(node);

        Set<Node> vNode = new HashSet<>();

        HashMap<Node, Node> nodeHashMap = new HashMap<>();
        nodeHashMap.put(node, head);

        while (!nodeStack.isEmpty()) {
            nodeP = nodeStack.pop();
            if (vNode.contains(nodeP)) {
                continue;
            }
            vNode.add(nodeP);
            if (nodeP.neighbors != null) {
                Node headP = nodeHashMap.get(nodeP);
                for (Node neighbor : nodeP.neighbors) {
                    Node ne;
                    if (nodeHashMap.keySet().contains(neighbor)) {
                        ne = nodeHashMap.get(neighbor);
                    } else {
                        ne = new Node(neighbor.val, new ArrayList<>());
                        nodeHashMap.put(neighbor, ne);
                    }

                    headP.neighbors.add(ne);
                    nodeStack.push(neighbor);
                }
            }
        }

        return head;
    }
}
