package com.softserve.edu06.task1;

public class App {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        addBirdsToArray(birds);
        callObjectsMethods(birds);

    }

    public static void callObjectsMethods(Bird[] birds) {
        for (Bird bird : birds) {
            bird.fly();
        }
    }
    public static void addBirdsToArray(Bird[] birds) {
        birds[0] = new Eagle("Black", 4);
        birds[1] = new Penguin("Brown", 9);
        birds[2] = new Swallow("White", 3);
        birds[3] = new Kiwi("Brown", 2);

    }
}
