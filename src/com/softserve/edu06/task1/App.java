package com.softserve.edu06.task1;

public class App {
    public static void main(String[] args) {
        Bird[] birds = new Bird[] {
            new Eagle("Black", true),
            new Penguin("Brown", true),
            new Swallow("White", true),
            new Kiwi("Brown", true),
        };
        callObjectsMethods(birds);

    }

    public static void callObjectsMethods(Bird[] birds) {
        for (Bird bird : birds) {
            bird.fly();
        }
    }
}
