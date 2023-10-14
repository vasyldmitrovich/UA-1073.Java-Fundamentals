package com.softserve.edu07.pt.task1;

public class App {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(1),
                new Cat(2),
                new Cat(3),
                new Dog(1),
                new Dog(2),
                new Dog(3)
        };
        for (var animal:animals) {
            animal.animalNum();
            animal.voice();
            animal.feed();
        }
    }
}
