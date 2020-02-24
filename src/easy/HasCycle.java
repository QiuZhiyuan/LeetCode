package easy;

import common.ListNode;

import java.util.HashSet;

public class HasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode p = head;
        HashSet<ListNode> nodeSet = new HashSet<>();
        while (p != null && p.next != null) {
            if (nodeSet.contains(p)) {
                return true;
            } else {
                nodeSet.add(p);
            }
            p = p.next;
        }
        return false;
    }
}
