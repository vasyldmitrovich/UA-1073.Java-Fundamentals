package com.softserve.edu15.pt;

public class Task2 {
    public static void main (String[] args) throws InterruptedException {
        var thread1 = new Thread(() -> {
            printFiveTimes("Hello, world");
        });

        var thread2 = new Thread(() -> {
            printFiveTimes("Peace in the peace");
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("My name is Alina");
    }

    public static void printFiveTimes(String message) {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            if (i != 4) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
