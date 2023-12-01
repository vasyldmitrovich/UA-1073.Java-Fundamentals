package com.softserve.edu15.Task1;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Message("Thread 1", 5));
        Thread thread2 = new Thread(new Message("Thread 2", 5));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();

            Thread thread3 = new Thread(new Message("Thread 3", 5));
            thread3.start();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Message implements Runnable {
    private final String threadName;
    private final int repetitions;

    public Message(String threadName, int repetitions) {
        this.threadName = threadName;
        this.repetitions = repetitions;
    }

    @Override
    public void run() {
        for (int i = 0; i < repetitions; i++) {
            System.out.println(threadName + ": Message " + (i + 1));
            try {
                Thread.sleep(100); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
