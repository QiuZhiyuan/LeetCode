package javalearn;

import java.util.concurrent.*;

public class ThreadLearn {

    private static ThreadLocal<SyscSercuity> threadLocal = new ThreadLocal<>();

    public static void main(String args[]) {
        new ThreadLearn().test();
    }

    public void test() {
//
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println(i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//            }
//        });
//        thread.run();

        SyncClass syncClass = new SyncClass();
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                syncClass.runAndSleep("thread1");
//            }
//        });
//        thread1.start();
//
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                syncClass.runAndSleep("thread2");
//            }
//        });
//        thread2.start();
//
//        Thread thread3 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                syncClass.restart();
//            }
//        });
//        thread3.start();

//
        SyscSercuity syscSercuity = new SyscSercuity();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                threadLocal.set(syscSercuity);
//                threadLocal.get().run("threadxx");
//            }
//        }).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                threadLocal.set(syscSercuity);
//                threadLocal.get().run("threadpp");
//            }
//        }).start();


        ThreadPoolExecutor poolExecutor = newThreadExecutor();
        ThreadFactory threadFactory = poolExecutor.getThreadFactory();
        threadFactory.newThread((new Runnable() {
            @Override
            public void run() {
                syncClass.runAndSleep("thread1");
            }
        })).start();
        threadFactory.newThread(new Runnable() {
            @Override
            public void run() {
                syncClass.runAndSleep("thread2");
            }
        }).start();

    }

    private class SyncClass {
        int sum = 0;

        public void runAndSleep(String string) {
            for (int i = 0; i < 10; i++) {
                System.out.println(string + " " + (sum++) + " i=" + i);
//                if (i == 5) {
//                    try {
//                        this.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public synchronized void restart() {
            this.notifyAll();
        }
    }

    private class SyscSercuity {
        int sum = 0;

        public void run(String string) {
            for (int i = 0; i < 10; i++) {
                System.out.println(string + " sum:" + sum++);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    private static class MyObj extends Object {
        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }
    }

    public static ThreadPoolExecutor newThreadExecutor() {
        return new ThreadPoolExecutor(1, 1,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
    }

}
