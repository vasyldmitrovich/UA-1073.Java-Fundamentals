package com.softserve.edu06.hw;

public class Task1 {
    public static void task1() {
        Bird[] birds = new Bird[]{
                new Eagle("Sweet", true),
                new Swallow("Black", false),
                new Penguin("Soft", true),
                new Kiwi("Small", false),
        };

        for (Bird bird : birds) {
            System.out.println(bird);
            bird.fly();
        }

    }
}
