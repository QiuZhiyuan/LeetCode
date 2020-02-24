package test;

import common.ListNode;

import java.util.Stack;

public class StackTest {
    public static void main(String args[]) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
        }
        System.out.println(args.length);
        new StackTest().listNodify(new ListNode(1));
    }

    public void listNodify(ListNode listNode) {
        Stack<ListNode> stack = new Stack<>();
        stack.push(listNode);
        ListNode[] list = new ListNode[1];
        list[0] = listNode;


        listNode.val = 10;
        System.out.println(stack.pop().val);
        System.out.println(list[0].val);
    }
}
