package com.softserve.edu15.hw;

class App {

    public static void main(String[] args) throws InterruptedException {

// HW 1
//        HwOne();


// HW 2 - deadlock
//        Thread mmmmain = Thread.currentThread();
//        mmmmain.join();


// HW 3

        one.start();



    }

    static void HwOne() throws InterruptedException {
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        thread3.start();
    }

    static Thread thread1 = new Thread(() -> {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from 1 thread");
        }
    });

    static Thread thread2 = new Thread(() -> {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from 2 thread");
        }
    });

    static Thread thread3 = new Thread(() -> {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from 3 thread");
        }
    });

    static Thread one = new Thread(() -> App.two.start());

    static Thread two = new Thread(() -> {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread number two");
        }
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread number three");
            }
        }).start();
    });
}
