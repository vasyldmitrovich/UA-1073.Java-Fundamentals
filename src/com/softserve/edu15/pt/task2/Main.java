package com.softserve.edu15.pt.task2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread threadFirst = createThread("Hello world", 2_000);
        Thread threadSecond = createThread("Peace in the world", 3_000);

        threadFirst.start();
        threadSecond.start();

        threadFirst.join();
        threadSecond.join();

        System.out.println("My name is ...");
    }

    private static Thread createThread(String message, long timeout) {
        Runnable run = () -> {
            for(int i = 0; i < 5; ++i){
                System.out.println(message);
                try {
                    Thread.sleep(timeout);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        return new Thread(run);
    }
}
