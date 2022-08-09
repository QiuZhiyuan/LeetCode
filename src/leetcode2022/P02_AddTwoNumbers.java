package leetcode2022;

import common.ListNode;
import common.Tools;

import java.util.List;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.



Example 1:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]



Constraints:

    The number of nodes in each linked list is in the range [1, 100].
    0 <= Node.val <= 9
    It is guaranteed that the list represents a number that does not have leading zeros.


[9,9,9,9,9,9,9]
[9,9,9,9]


 */
public class P02_AddTwoNumbers {

    public static void main(String args[]) {
        P02_AddTwoNumbers addTwoNumbers = new P02_AddTwoNumbers();
        Tools.println(addTwoNumbers.addTwoNumbers(ListNode.create("[9,9,9,9]"), ListNode.create("[9]")));
        Tools.println(addTwoNumbers.addTwoNumbers(ListNode.create("[9]"), ListNode.create("[9]")));
        Tools.println(addTwoNumbers.addTwoNumbers(ListNode.create("[9]"), ListNode.create("[9,9,9]")));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = l1;
        int t = 0;
        while (l1 != null) {
            int p = l2 == null ? (l1.val + t) : (l1.val + l2.val + t);
            t = p / 10;
            l1.val = p % 10;
            if (l1.next == null) {
                if (l2 != null && l2.next != null) {
                    l1.next = l2.next;
                    l2 = null;
                } else if (t > 0) {
                    l1.next = new ListNode(t);
                    break;
                }
            }
            l1 = l1.next;
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return result;
    }
}
