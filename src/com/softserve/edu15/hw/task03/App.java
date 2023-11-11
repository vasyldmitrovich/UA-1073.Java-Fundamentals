package com.softserve.edu15.hw.task03;

public class App {
    public static void main(String[] args) {
        var t3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread number three");
            }
        });
        var t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
            }
            t3.start();
        });
        var t1 = new Thread(() -> {
            t2.start();
        });
        t1.start();
    }
}
