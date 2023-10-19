package com.softserve.edu06.hw.task1;

public class Task1Edu06Hw {
    public static void main(String[] args) {

        Bird[] birds = {
                new Swallow(),
                new Eagle(),
                new Kiwi(),
                new Penguin(),
        };
        printBirds(birds);
        flyBirds(birds);
    }


    private static void flyBirds(Bird[] birds) {
        for (Bird bird : birds) {
            bird.fly();
        }
    }

    private static void printBirds(Bird[] birds) {
        System.out.println("Information about birds:");
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
}
