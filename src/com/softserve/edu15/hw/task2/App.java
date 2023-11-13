package com.softserve.edu15.hw.task2;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread();
        mainThread.join();
    }
}
