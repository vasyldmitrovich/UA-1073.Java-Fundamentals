package com.softserve.edu15.hw;

public class Task3 {
    public static void main (String[] args) {

        var t3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread number three");
            }
        }, "three");

        var t2 = new Thread(() -> {
            for (int j = 0; j < 3; j++) {
                System.out.println("Thread number two");
            }
            t3.start();
        }, "two");


        var t1 = new Thread(() -> {
            t2.start();
        }, "one");

        t1.start();

    }
}
