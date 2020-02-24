package easy;

import mid.AddTwoNumbers;

public class RemoveElements {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode pre = head;
        ListNode ne = head.next;
        while (ne != null) {
            if (val == ne.val) {
                pre.next = ne.next;
            } else {
                pre = pre.next;
            }
            ne = ne.next;
        }
        if (val == head.val) {
            head = head.next;
        }
        return head;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
