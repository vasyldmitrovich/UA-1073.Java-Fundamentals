package com.softserve.edu04.hw.task5;

public class Task5Edu04Hw {//Give another name of class for example Task5.java

    public static void task5Edu04Hw() {
        Dog dog1 = new Dog("Boni", 2, Breed.PUG);
        Dog dog2 = new Dog("Lukas", 5, Breed.SPANIEL);
        Dog dog3 = new Dog("Herda", 1, Breed.BULDOG);

        Dog oldDog = theOldestDog(dog1, dog2, dog3);
        boolean dublicat = dublicateName(dog1, dog2, dog3);

        if (dublicat == true) {
            System.out.println("Dogs have same names");
        }
        if (dublicat == false) {
            System.out.println("Dogs do not have same names");
        }
        System.out.println("The oldest dog is: " + oldDog);
    }
    static Dog theOldestDog(Dog dog1, Dog dog2, Dog dog3) {
        Dog res = dog1;
        if (dog2.getAge() > res.getAge()) {
            res = dog2;
        }
        if (dog3.getAge() > res.getAge()) {
            res = dog3;
        }
        return res;

    }

    static boolean dublicateName(Dog dog1, Dog dog2, Dog dog3) {
        boolean dublicat;
        if (dog1.getName().equals(dog2.getName()) || dog2.getName().equals(dog3.getName()) || dog1.getName().equals(dog3.getName())) {
            return dublicat = true;

        }
        else {
            return dublicat = false;
        }

    }


}
