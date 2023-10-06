package com.softserve.edu04.hw;

public class Task5 {
    public static void task5() {//Ok

        Dog d1 = new Dog("Bars", Breed.CHIHUAHUA, 5);
        Dog d2 = new Dog("Lemurko", Breed.MALTESE, 1);
        Dog d3 = new Dog("Bars", Breed.PEKINGESE, 7);

        if (checkDogsName(d1, d2, d3)) {
            System.out.println("We have two dogs with the same name!");
        } else {
            System.out.println("We don`t have any dogs with the same name.");
        }
        Dog theOldestDog = findTheOldestdog(d1, d2, d3);
        System.out.print("The oldest dog is " + theOldestDog.getName());
        System.out.println(", breed - " + theOldestDog.getBreed().breed);

    }

    public static boolean checkDogsName(Dog d1, Dog d2, Dog d3) {
        if (d1.getName().equals(d2.getName())) {
            return true;
        }
        if (d2.getName().equals(d3.getName())) {
            return true;
        }
        return d1.getName().equals(d3.getName());
    }

    public static Dog findTheOldestdog(Dog d1, Dog d2, Dog d3) {
        Dog max = d1;
        if (max.getAge() < d2.getAge()) {
            max = d2;
        }
        if (max.getAge() < d3.getAge()) {
            max = d3;
        }
        return max;
    }

}
