package common;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode create(String str) {
        String subStr = str.substring(1, str.length() - 1);
        String[] itemStrList = subStr.split(",");
        ListNode head = null;
        ListNode p = null;
        for (String item : itemStrList) {
            final int value = Integer.parseInt(item);
            if (head == null) {
                head = new ListNode(value);
                p = head;
            } else {
                p.next = new ListNode(value);
                p = p.next;
            }
        }
        return head;
    }

    public void println() {
        ListNode p = this;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "ListNote val:"+val+" hash:"+hashCode();
    }
}