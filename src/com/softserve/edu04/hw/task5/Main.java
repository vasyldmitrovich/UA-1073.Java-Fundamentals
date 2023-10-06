package com.softserve.edu04.hw.task5;

public class Main {//Give another name of class for example Task5.java

    public static void task5Edu04Hw() {
        Dog dog1 = new Dog("Boni", 2, Breed.PUG);
        Dog dog2 = new Dog("Lukas", 5, Breed.SPANIEL);
        Dog dog3 = new Dog("Herda", 1, Breed.BULDOG);

        Dog oldDog = Dog.theOldestDog(dog1, dog2, dog3);
        boolean dublicat = Dog.dublicateName(dog1, dog2, dog3);

        if (dublicat == true) {
            System.out.println("Dogs have same names");
        }
        if (dublicat == false) {
            System.out.println("Dogs do not have same names");
        }
        System.out.println("The oldest dog is: " + oldDog);
    }


}
