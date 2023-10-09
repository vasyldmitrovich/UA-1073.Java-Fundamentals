package com.softserve.edu06.hw.task01;

public class App {
    public static void main(String[] args) {//Nice
        Bird[] birds = {
                new Eagle("Gray", true),
                new Swallow("Brown", true),
                new Penguin("Black", true),
                new Kiwi("Gray", true)
        };
        for (var bird : birds) {
            bird.fly();
        }
        for (var bird : birds) {
            System.out.println(bird);
        }
    }
}
