package easy;

import common.ListNode;

import java.util.HashSet;

public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;

        HashSet<ListNode> nodeSet = new HashSet<>();
        while (p1 != null || p2 != null) {
            if (p1 != null) {
                if (nodeSet.contains(p1)) {
                    return p1;
                } else {
                    nodeSet.add(p1);
                }
                p1 = p1.next;
            }
            if (p2 != null) {
                if (nodeSet.contains(p2)) {
                    return p2;
                } else {
                    nodeSet.add(p2);
                }
                p2 = p2.next;
            }
        }
        return null;
    }
}
