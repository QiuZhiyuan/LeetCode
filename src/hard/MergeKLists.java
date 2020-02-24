package hard;

import java.util.*;

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> listNodes = new ArrayList<>();
        for (ListNode node : lists) {
            insertList(listNodes, node);
        }
        ListNode head = null;
        ListNode point = null;
        while (listNodes.size() > 0) {
            ListNode node = listNodes.get(0);
            listNodes.remove(0);
            if (head == null) {
                head = node;
                point = head;
            } else {
                point.next = node;
                point = point.next;
            }
            insertList(listNodes, node.next);
        }

        return head;
    }

    public ListNode mergeKListsX(ListNode[] lists) {
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for (ListNode node : lists) {
            if (node != null) {
                priorityQueue.add(node);
            }
        }
        ListNode head = null;
        ListNode point = null;
        while (!priorityQueue.isEmpty()) {
            ListNode node = priorityQueue.poll();
            if (head == null) {
                head = node;
                point = head;
            } else {
                point.next = node;
                point = point.next;
            }
            if (node.next != null) {
                priorityQueue.add(node.next);
            }
        }
        return head;
    }

    private void insertList(List<ListNode> listNodes, ListNode node) {
        if (node == null) {
            return;
        }
        if (listNodes.size() == 0) {
            listNodes.add(node);
            return;
        }
        for (int i = 0; i < listNodes.size(); i++) {
            if (listNodes.get(i).val > node.val) {
                listNodes.add(i, node);
                return;
            }
        }
        listNodes.add(node);
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
