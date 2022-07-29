package mid;

public class AddTwoNumbers {

    public static void main(String args[]) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode end = null;
        ListNode result = null;
        int t = 0;
        while (l1 != null || l2 != null) {
            int v1 = 0;
            int v2 = 0;
            if (l1 != null) {
                v1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                v2 = l2.val;
                l2 = l2.next;
            }
            int k = v1 + v2 + t;
            int p = k % 10;
            if (end == null) {
                end = new ListNode(p);
                result = end;
            } else {
                end.next = new ListNode(p);
                end = end.next;
            }
            t = k / 10;
        }
        if (t > 0) {
            end.next = new ListNode(t);
            end = end.next;
        }
        return result;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
