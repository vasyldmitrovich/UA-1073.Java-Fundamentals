package com.softserve.edu06.hw.task1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {
                new Swallow(),
                new Kiwi(),
                new Penguin(),
                new Eagle()
        };

        flyBirds(birds);//Good
        printBirdsInfo(birds);//Very nice
    }

    private static void flyBirds(Bird[] birds){
        for (Bird bird : birds){
            bird.fly();
        }
    }

    private static void printBirdsInfo(Bird[] birds){
        System.out.println("Information about birds:");
        for (Bird bird : birds){
            System.out.printf("\t%s%n", bird);
        }
    }
}
