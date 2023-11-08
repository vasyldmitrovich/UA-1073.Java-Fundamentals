package com.softserve.edu15.hw.task2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread();

        Thread thread = new Thread(() -> {
            System.out.println("Thread: " + Thread.currentThread().getName());
            try {
                mainThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread.start();
        System.out.println("Thread: " + Thread.currentThread().getName());
        mainThread.join();
    }
}
