package com.softserve.edu04.hw;

class Dog {

    private final String name;
    private final int age;
    private final Breed breed;

    Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    static void sameName(Dog a, Dog b, Dog c) {
        if (a.name.equals(b.name) || a.name.equals(c.name) || b.name.equals(c.name)) {
            System.out.println("Yes, there are few dogs with the same name");
        } else {
            System.out.println("No, there are no dogs with the same name");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Breed getBreed() {
        return breed;
    }
}
