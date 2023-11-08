package com.softserve.edu15.pt.task1;

public class Main {
    public static void main(String[] args) {
        String message = "I study Java";
        long interval = 1_000L;
        int count = 10;

        for(int i = 0; i < count; ++i){
            System.out.println(message);
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
