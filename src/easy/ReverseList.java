package easy;

import common.ListNode;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode p1, p2, p3;
        p1 = head;
        if (p1 != null) {
            p2 = p1.next;
        } else {
            return null;
        }
        if (p2 != null) {
            p3 = p2.next;
        } else {
            return p1;
        }
        head.next = null;
        while (p2 != null) {
            p2.next = p1;
            p1 = p2;
            p2 = p3;
            if (p2 != null) {
                p3 = p2.next;
            }
        }
        return p1;
    }
}
