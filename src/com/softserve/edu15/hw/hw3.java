package com.softserve.edu15.hw;

public class hw3 {
    public static void main(String[] args) {
        Thread threadOne = new Thread(() -> {
            System.out.println("Thread one starts thread two.");
            Thread threadTwo = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }
            });
            threadTwo.start();
            try {
                threadTwo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread one starts thread three.");
            Thread threadThree = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread number three");
                }
            });
            threadThree.start();
        });

        threadOne.start();

        try {
            threadOne.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting.");
    }
}

