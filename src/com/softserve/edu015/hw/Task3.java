package com.softserve.edu015.hw;

public class Task3 {
    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            System.out.println("Thread one");

            Thread two = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            two.start();

            try {
                two.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Thread three = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread number three");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            three.start();

            try {
                three.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        one.start();
    }
}
