package com.softserve.edu15.hw.task3;

public class Main {
    private static final long TIMEOUT = 500L;
    public static void main(String[] args) {
        Runnable runnableOne = createRunnableFirst();
        Thread one = new Thread(runnableOne);
        one.start();
    }

    private static Runnable createRunnableFirst(){
        return () -> {
            Runnable runnableTwo = createRunnableSecond();
            Thread two = new Thread(runnableTwo);
            two.start();
        };
    }

    private static Runnable createRunnableSecond(){
        return () -> {
            Runnable runnableThree = createRunnableThird();
            Thread three = new Thread(runnableThree);
            three.start();

            print("Thread two", 3);
        };
    }

    private static Runnable createRunnableThird(){
        return () -> print("Thread three", 5);
    }

    private static void print(String message, int countRepeat){
        for(int i = 0; i < countRepeat; ++i){
            System.out.println(message);
            try {
                Thread.sleep(TIMEOUT);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
