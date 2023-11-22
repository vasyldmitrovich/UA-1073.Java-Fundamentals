package com.softserve.edu015.hw;

public class Task1 {
    public static void main(String[] args) {
        var t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("God day!");
            }
        });

        var t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Good evening!");
            }
        });

        var t3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Good night!");
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();
    }
}
