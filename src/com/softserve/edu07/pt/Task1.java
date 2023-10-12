package com.softserve.edu07.pt;

public class Task1 {
    public static void task1() {
        Animal[] animals = new Animal[]{
                new Cat(),
                new Dog(),
                new Dog(),
                new Cat()
        };

        for (Animal animal : animals) {
            animal.feed();
            animal.voice();
        }
    }
}
