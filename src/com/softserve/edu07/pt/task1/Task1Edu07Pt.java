package com.softserve.edu07.pt.task1;

public class Task1Edu07Pt {
    public static void task1() {

        Animal[] animals = {
                new Cat(),
                new Dog(),

        };

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();

            System.out.println(animal);
            System.out.println();


        }
    }

}
