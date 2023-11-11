package com.softserve.edu15.hw.task01;

public class App {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("First thread is running");
            }
        });
        var t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Second thread is running");
            }
        });
        var t3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Third thread is running");
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
    }
}
