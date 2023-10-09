package com.softserve.edu06.hw.task1;

public class App {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle("Black", true),
                new Swallow("White", false),
                new Kiwi("Brown", true),
                new Penguin("Black and white", true)
        };
        for (var bird: birds) {
            bird.fly();
        }
        for (var bird: birds) {
            System.out.println(bird);
        }
    }
}
