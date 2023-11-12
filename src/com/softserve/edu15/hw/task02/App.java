package com.softserve.edu15.hw.task02;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread();
        t.join();
    }
}
