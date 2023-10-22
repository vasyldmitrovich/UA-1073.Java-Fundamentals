package com.softserve.edu06.hw.task1;

public class Task1Edu06Hw {//Good
    public static void task1Edu06Hw() {

        Bird[] birds = new Bird[]{
                new Eagle("Gray", true),
                new Swallow("Black and White", true),
                new Penguin("Black and White", true),
                new Kiwi("Black and Gray", true),
        };

        for (Bird bird : birds) {
            bird.fly();
            System.out.println(bird);
            System.out.println();
        }

    }


}

