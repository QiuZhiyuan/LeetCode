package easy;

public class GetDecimalValue1290 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int getDecimalValue(ListNode head) {
        int result = head.val;
        while (head.next != null) {
            head = head.next;
            result = (result << 1) + head.val;
        }
        return result;
    }
}
