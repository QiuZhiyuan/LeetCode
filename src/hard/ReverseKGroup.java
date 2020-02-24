package hard;

public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k < 1) {
            return head;
        }
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode point = preHead;
        while (point != null) {
            ListNode prePart = point;
            ListNode partHead = point.next;
            point = prePart;
            for (int i = 0; i < k && point != null; i++) {
                point = point.next;
            }
            if (point != null) {
                ListNode nextP = point.next;
                point = rePartList(prePart, partHead, point);
                point.next = nextP;
            }
        }
        return preHead.next;
    }

    /**
     * @param pre  head之前的节点
     * @param head 片段的头部
     * @param end  片段的尾部
     * @return 反转后的片段的尾部
     */
    private ListNode rePartList(ListNode pre, ListNode head, ListNode end) {
        if (head == end) {
            return end;
        }
        ListNode p = head;
        ListNode q = p.next;
        ListNode n = null;
        if (q != null) {
            n = q.next;
        }
        while (q != null && p != end) {
            q.next = p;
            p = q;
            q = n;
            if (n != null) {
                n = n.next;
            }
        }

        if (pre != null) {
            pre.next = end;
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
