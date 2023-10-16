package com.softserve.edu04.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

enum Breed {
    LABRADOR, GOLDEN_RETRIEVER, GERMAN_SHEPHERD, BULLDOG, BEAGLE
}

class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
}

public class hw4 {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Buddy", Breed.LABRADOR, 5));
        dogs.add(new Dog("Max", Breed.GOLDEN_RETRIEVER, 4));
        dogs.add(new Dog("Charlie", Breed.GERMAN_SHEPHERD, 6));


        if (hasDuplicateNames(dogs)) {
            System.out.println("There are dogs with the same name.");
        } else {
            System.out.println("All dogs have unique names.");
        }
        Dog oldestDog = findOldestDog(dogs);
        System.out.println("The oldest dog is named " + oldestDog.getName() +
                " and is of breed " + oldestDog.getBreed());
    }

    private static boolean hasDuplicateNames(List<Dog> dogs) {
        List<String> names = new ArrayList<>();
        for (Dog dog : dogs) {
            if (names.contains(dog.getName())) {
                return true;
            }
            names.add(dog.getName());
        }
        return false;
    }


    private static Dog findOldestDog(List<Dog> dogs) {
        return Collections.max(dogs, (dog1, dog2) -> Integer.compare(dog1.getAge(), dog2.getAge()));
    }
}
