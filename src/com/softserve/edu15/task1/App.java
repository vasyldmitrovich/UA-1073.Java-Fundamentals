package com.softserve.edu15.task1;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1: Message " + (i + 1));
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2: Message " + (i + 1));
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 3: Message " + (i + 1));
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        t3.start();
    }
}
