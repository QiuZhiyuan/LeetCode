package easy;

import common.ListNode;

public class DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode point = head;
        while (point != null && point.next != null) {
            if (point.val == point.next.val) {
                point.next = point.next.next;
            } else{
                point = point.next;
            }
        }
        return head;
    }
}
