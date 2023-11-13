package com.softserve.edu15.task2;

public class App {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 is trying to get lock.");
            synchronized (lock1) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2) {
                    System.out.println("Thread 1 has got lock.");
                }

            }

        });

        Thread t2 = new Thread(() -> {
            System.out.println("Main thread is trying to get lock.");
            synchronized (lock2) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1) {
                    System.out.println("Main thread has got lock.");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
