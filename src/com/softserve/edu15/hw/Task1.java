package com.softserve.edu15.hw;

public class Task1 {
    public static void main (String[] args) throws InterruptedException {
        var t1 = new Thread(Task1::printFiveTimes);
        var t2 = new Thread(Task1::printFiveTimes);
        var t3 = new Thread(Task1::printFiveTimes);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        t3.start();
    }

    public synchronized static void printFiveTimes() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, " + Thread.currentThread().getName());
        }
    }
}
