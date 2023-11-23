package com.softserve.edu15.hw.Task2;

public class Main {
    static Object LOCK1 = new Object();
    static Object LOCK2 = new Object();
    public static void main(String[] args) {
        var t1 = new Thread( () -> {
            synchronized (LOCK1) {
                System.out.println("start1");
            }
            synchronized (LOCK2) {
                System.out.println("start2");
            }
        }
        );
        var t2 = new Thread( () -> {
            synchronized (LOCK2) {
                System.out.println("finish1");
            }
            synchronized (LOCK1) {
                System.out.println("finish2");
            }
        }
        );
    }
}
