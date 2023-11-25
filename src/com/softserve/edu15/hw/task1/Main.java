package com.softserve.edu15.hw.task1;

public class Main {
    public static void main(String[] args) {
        App thread1 = new App("Thread 1", 5);
        App thread2 = new App("Thread 2", 5);
        App thread3 = new App("Thread 3", 5);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread3.start();
    }
}