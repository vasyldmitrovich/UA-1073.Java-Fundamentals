package com.softserve.edu04.hw;

import javax.sound.midi.Soundbank;

public class Task5 {
    public static void run() {
        Dog dog1 = new Dog();
        dog1.promptValues();
        Dog dog2 = new Dog();
        dog2.promptValues();
        Dog dog3 = new Dog();
        dog3.promptValues();
        if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName()) || dog2.getName().equals(dog3.getName())) {
            System.out.println("There are dogs with same name");
        } else {
            System.out.println("There are no dogs with same name");
        }
        Dog oldestDog = dog1.getAge() > dog2.getAge() ? dog1 : dog2;
        oldestDog = dog3.getAge() > oldestDog.getAge() ? dog3 : oldestDog;
        System.out.println("The oldest dog is " + oldestDog.getName() + ", " + oldestDog.getBreed());
    }
}
