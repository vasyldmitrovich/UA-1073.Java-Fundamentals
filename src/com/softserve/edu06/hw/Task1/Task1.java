package com.softserve.edu06.hw.Task1;

public class Task1 {//Ok
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(),
                new Swallow(),
                new Penguin(),
                new Kiwi()
        };

        for (Bird bird : birds) {
            bird.fly();
            System.out.println("Feathers: " + bird.getFeathers() + ", Can Lay Eggs: " + bird.canLayEggs());
            System.out.println();
        }
    }
}

