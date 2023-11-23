package com.softserve.edu15.hw.Task3;

public class Main {
    public static void main(String[] args) {
        var t1 = new Thread(() -> {
            var t2 = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }
                var t3 = new Thread(() -> {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread number three");
                    }
                }
                );
                t3.start();
            }
            );
            t2.start();
        }
        );
        t1.start();
    }
}
