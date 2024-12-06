package mid;

import common.ListNode;

public class InsertionSortList147 {

    public static void main(String args[]) {
        final ListNode head = new ListNode(4);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(6);
        head.next.next.next.next = new ListNode(0);
        new InsertionSortList147().insertionSortList(head).println();
    }

    //    public ListNode insertionSortList(ListNode head) {
//        ListNode topNode = head;
//        ListNode searchNode, minNode;
//        int min;
//        while (topNode.next != null) {
//            searchNode = topNode;
//            min = searchNode.val;
//            minNode = searchNode;
//            while (searchNode != null) {
//                if (min > searchNode.val) {
//                    min = searchNode.val;
//                    minNode = searchNode;
//                }
//                searchNode = searchNode.next;
//            }
//            if (minNode != topNode) {
//                int t = topNode.val;
//                topNode.val = minNode.val;
//                minNode.val = t;
//            }
//            topNode = topNode.next;
//        }
//        return head;
//    }
    public ListNode insertionSortList(ListNode head) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode topNode = preHead;
        ListNode searchNode;
        ListNode minNode;
        ListNode preMinNode;
        int min;
        while (topNode.next != null) {
            searchNode = topNode.next;
            minNode = searchNode;
            min = searchNode.val;
            preMinNode = null;
            while (searchNode.next != null) {
                if (min > searchNode.next.val) {
                    min = searchNode.next.val;
                    preMinNode = searchNode;
                    minNode = searchNode.next;
                }
                searchNode = searchNode.next;
            }
            if (preMinNode != null) {
                preMinNode.next = minNode.next;
            }
            if (topNode.next != minNode) {
                minNode.next = topNode.next;
                topNode.next = minNode;
            }
            topNode = topNode.next;
        }
        return preHead.next;
    }
}
