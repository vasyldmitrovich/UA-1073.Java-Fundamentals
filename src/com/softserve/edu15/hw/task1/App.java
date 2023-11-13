package com.softserve.edu15.hw.task1;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("First message from thread 1");
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Second message from thread 2");
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Third message from thread 3");
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        thread3.start();
    }
}
