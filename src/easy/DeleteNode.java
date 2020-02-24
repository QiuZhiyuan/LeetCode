package easy;

public class DeleteNode {
    public void deleteNode(ListNode node) {
        while (true) {
            node.val = node.next.val;
            if (node.next.next == null) {
                node.next = null;
                break;
            } else {
                node = node.next;
            }
        }
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
