package com.softserve.edu15.Task3;

public class Main {
    public static void main(String[] args) {
        Thread one = new Thread(new Task("Thread number one"));
        Thread two = new Thread(new Task("Thread number two", 3, one));
        Thread three = new Thread(new Task("Thread number three", 5));

        one.start();
    }
}

class Task implements Runnable {
    private final String message;
    private final int repetitions;
    private final Thread nextThread;

    public Task(String message) {
        this.message = message;
        this.repetitions = 1;
        this.nextThread = null;
    }

    public Task(String message, int repetitions) {
        this.message = message;
        this.repetitions = repetitions;
        this.nextThread = null;
    }

    public Task(String message, int repetitions, Thread nextThread) {
        this.message = message;
        this.repetitions = repetitions;
        this.nextThread = nextThread;
    }

    @Override
    public void run() {
        for (int i = 0; i < repetitions; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + message);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (nextThread != null) {
            nextThread.start();
            try {
                nextThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
