package com.softserve.edu04.hw.Task5;

public class App {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Anton", "Labrador", 3);
        Dog dog2 = new Dog("Bobik", "Vivcharka", 5);
        Dog dog3 = new Dog("Bobik", "Labrador", 4);

        if (dog1.getDogName().equals(dog2.getDogName()) || dog1.getDogName().equals(dog3.getDogName())) {
            System.out.println("Some dog have same names");
        }
        if (dog2.getDogName().equals(dog1.getDogName()) || dog2.getDogName().equals(dog3.getDogName())) {
            System.out.println("Some dog have same names");
        } else {
            System.out.println("No do with same names");
        }


        if (dog1.getDogAge() < dog2.getDogAge()) {
            dog1 = dog2;
        }
        if (dog1.getDogAge() < dog3.getDogAge()) {
            dog1 = dog3;
        }
        System.out.println("The oldest dog is " + dog1.getDogName() + " " + dog1.getDogBreed());
    }
}
