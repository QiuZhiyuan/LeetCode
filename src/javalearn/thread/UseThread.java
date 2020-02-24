package javalearn.thread;

import java.util.concurrent.CountDownLatch;

public class UseThread {
    public static void main(String args[]) {
        System.out.println("hello");
    }

    private CountDownLatch countDownLatch = new CountDownLatch(1);
}
