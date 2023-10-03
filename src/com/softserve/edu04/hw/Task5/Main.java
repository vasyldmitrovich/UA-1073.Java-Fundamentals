package com.softserve.edu04.hw.Task5;

public class Main {
    public static boolean sameName;
    public static void main(String[] args) {
        Dog dog1 = new Dog("Tony", FieldBreed.PITBULL.en, 2);
        Dog dog2 = new Dog("Tony", FieldBreed.ROTTWEILER.en, 5);
        Dog dog3 = new Dog("Mia", FieldBreed.BULLDOG.en, 1);
        Dog theOldestDog = Dog.theOldestDog(dog1,dog2,dog3);
        sameName = Dog.sameName(dog1,dog2,dog3);
        System.out.println("The oldest dog is " + theOldestDog);
        Dog.checkIfHaveSameName();
    }
}
