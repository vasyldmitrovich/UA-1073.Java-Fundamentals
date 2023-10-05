package com.softserve.edu04.hw;

public class Dog {

    private final String name;
    private final int age;
    private final Breed breed;

    enum Breed {
        BEAGLE, BULLDOG, LABRADOR
    }

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public static void oldestDog(Dog a, Dog b, Dog c) {
        Dog temp;
        if (a.age > b.age && a.age > c.age) {
            temp = a;
        } else if (b.age > a.age && b.age > c.age) {
            temp = b;
        } else {
            temp = c;
        }
        System.out.println(temp.name + " is he oldest dog. " + temp.name + " is " + temp.age + " years old");
    }

    public static void sameName(Dog a, Dog b, Dog c) {
        if (a.name.equals(b.name) || a.name.equals(c.name) || b.name.equals(c.name)) {
            System.out.println("Yes, there are few dogs with the same name");
        } else {
            System.out.println("No, there are no dogs with the same name");
        }
    }

}
