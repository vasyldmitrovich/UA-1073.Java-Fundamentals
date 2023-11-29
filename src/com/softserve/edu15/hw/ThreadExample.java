package com.softserve.edu15.hw;

public class ThreadExample {

    public static void main(String[] args) {
        Thread threadThree = new Thread(new messageprinter("Потік номер три", 5));
        Thread threadTwo = new Thread(new MessagePrinterWithSubthread("Потік номер два", 3, threadThree));
        Thread threadOne = new Thread(new MessagePrinterWithSubthread("Потік номер один", 1, threadTwo));

        threadOne.start();
    }
}

class messageprinter implements Runnable {
    private String message;
    private int repetitions;

    public messageprinter(String message, int repetitions) {
        this.message = message;
        this.repetitions = repetitions;
    }

    @Override
    public void run() {
        for (int i = 0; i < repetitions; i++) {
            System.out.println(message);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MessagePrinterWithSubthread implements Runnable {
    private String message;
    private int repetitions;
    private Thread subthread;

    public MessagePrinterWithSubthread(String message, int repetitions, Thread subthread) {
        this.message = message;
        this.repetitions = repetitions;
        this.subthread = subthread;
    }

    @Override
    public void run() {
        for (int i = 0; i < repetitions; i++) {
            System.out.println(message);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        subthread.start();
    }
}