package com.softserve.edu07.pt;

interface Animal {
    void voice();

    void feed();
}

class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void feed() {
        System.out.println("Feeding cat");
    }
}

class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Woof");
    }

    @Override
    public void feed() {
        System.out.println("Feeding dog");
    }
}

public class hw1 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cat();

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
            System.out.println();
        }
    }
}
