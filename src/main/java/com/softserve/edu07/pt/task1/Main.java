package com.softserve.edu07.pt.task1;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Cat(),
                new Cat(),
                new Dog(),
                new Dog(),
                new Cat(),
                new Cat(),
                new Dog()
        };
        voiceAnimals(animals);
        feedAnimals(animals);
    }

    private static void voiceAnimals(Animal[] animals){
        for(Animal animal : animals){
            System.out.println(animal.voice());
        }
    }

    private static void feedAnimals(Animal[] animals){
        for(Animal animal : animals){
            System.out.println(animal.feed());
        }
    }
}
