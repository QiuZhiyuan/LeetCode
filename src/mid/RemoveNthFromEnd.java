package mid;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null && n > 0) {
            return null;
        }

        ListNode first = head;
        ListNode second = head;
        for (int i = 0; i < n; i++) {
            first = first.next;
            if (first == null) {
                return head.next;
            }
        }

        while (first.next != null) {
            first = first.next;
            second = second.next;
        }
        if (second.next != null) {
            second.next = second.next.next;
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
