package easy;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack225 {

    private Queue<Integer> qIn = new LinkedList<>();
    private Queue<Integer> qOut = new LinkedList<>();

    /**
     * Initialize your data structure here.
     */
    public MyStack225() {

    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        qIn.offer(x);
        qOut.clear();
        for (int i = 0; i < qIn.size(); i++) {
            qOut.offer(qIn.poll());
        }
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        qIn.poll();
        return qOut.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return qOut.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return qOut.isEmpty();
    }
}
