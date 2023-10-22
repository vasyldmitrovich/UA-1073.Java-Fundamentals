package com.softserve.edu07.pt.task1;

public class Task1 {//Ok
    public static void main (String[] args) {
        Animal[] animals = {
                new Cat(),
                new Dog(),
                new Cat(),
                new Dog()
        };

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
        }
    }
}
