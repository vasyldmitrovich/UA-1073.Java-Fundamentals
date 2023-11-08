package com.softserve.edu15.hw.task1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long timeout = 500L;
        Thread threadFirst = createThread("Hello world", timeout);
        Thread threadSecond = createThread("Peace in the world", timeout);
        Thread threadThird = createThread("I study Java", timeout);

        threadFirst.start();
        threadSecond.start();

        threadFirst.join();
        threadSecond.join();

        threadThird.start();
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
