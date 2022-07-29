package easy;

import common.ListNode;
public class Rotate {
    public static void main(String args[]) {
        new Rotate().rotateII(new int[]{1, 3, 4, 5, 6}, 2);
    }

    public void rotateI(int[] nums, int k) {
        if (nums.length < 2) {
            return;
        }
        ListNode head = new ListNode(nums[0]);
        ListNode p = head;
        for (int i = 1; i < nums.length; i++) {
            p.next = new ListNode(nums[i]);
            p = p.next;
        }
        p.next = head;
        for (int i = 0; i < (nums.length - k % nums.length); i++) {
            head = head.next;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = head.val;
            head = head.next;
        }
    }

    public void rotateII(int[] nums, int k) {
        if (nums.length < 2) {
            return;
        }
        k = k % nums.length;
        int count = 0;
        int top = 0;
        int temp = nums[top];
        while (count < nums.length) {
            top = top + k;
            if (top >= nums.length) {
                top = top - nums.length;
            }
            int p = nums[top];
            nums[top] = temp;
            temp = p;
            count++;
        }
    }
}
