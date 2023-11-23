package com.softserve.edu15.hw.Task1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Massage from thread 1");
            }
        }
        );
        var t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Massage from thread 2");
            }
        }
        );
        var t3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Massage from thread 3");
            }
        }
        );
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
    }
}
