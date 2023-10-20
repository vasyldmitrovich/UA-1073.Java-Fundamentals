package com.softserve.edu06.hw.Task1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle("brown", true),
                new Kiwi("black", true),
                new Penguin("black and white", true),
                new Swallow("brown", true),
        };
        for (var bird: birds ) {
            bird.fly();
        }
        for (var bird: birds ) {
            System.out.println(bird.toString()); ;
        }
    }
}
