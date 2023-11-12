package com.softserve.edu15.pt;

public class pt2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, world");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Peace in the peace");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("My name is ...");
    }
}

