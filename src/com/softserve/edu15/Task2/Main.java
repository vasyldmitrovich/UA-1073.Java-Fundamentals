package com.softserve.edu15.Task2;

public class Main {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task(lock1, lock2));
        Thread thread2 = new Thread(new Task(lock2, lock1));

        thread1.start();
        thread2.start();
    }
}

class Task implements Runnable {
    private final Object lock1;
    private final Object lock2;

    public Task(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + " acquired lock1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " acquired lock2");
            }
        }
    }
}

