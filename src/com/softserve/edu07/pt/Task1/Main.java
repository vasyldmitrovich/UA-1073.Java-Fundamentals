package com.softserve.edu07.pt.Task1;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Dog(),
        };
        for (var animal: animals) {
            animal.voice();
            animal.feed();
        }
    }
}
