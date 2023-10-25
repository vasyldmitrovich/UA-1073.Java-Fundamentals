package com.softserve.edu06.hw.Task1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(),
                new Swallow(),
                new Penguin(),
                new Kiwi()
        };

        for (Bird bird : birds) {
            System.out.println("Bird: " + bird.getClass().getSimpleName());
            System.out.println("Feathers: " + bird.hasFeathers());
            System.out.println("Lays Eggs: " + bird.laysEggs());
            bird.fly();
            System.out.println("-----------");
        }
    }
}
