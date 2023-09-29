package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task5 {

    public static void main() {
        Dog dog1 = promptParameters();
        Dog dog2 = promptParameters();

        if (dog2.getName() == dog1.getName()) {
            System.out.println("Dog 2 has the same name as dog1: " + dog2.getName());
        }

        Dog dog3 = promptParameters();

        if (dog3.getName() == dog1.getName()) {
            System.out.println("Dog 3 has the same name as dog1: " + dog3.getName());
        } else if (dog3.getName() == dog2.getName()) {
            System.out.println("Dog 3 has the same name as dog2: " + dog3.getName());
        }

        System.out.println("The oldest dog is '" + nameOldestDog + "'" + " his age is " + oldestDogAge);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static int oldestDogAge = 0;
    public static String nameOldestDog;

    public static Dog promptParameters() {
        System.out.println("Input name of your dog:");
        String name = scanner.nextLine();
        System.out.println("Input breed of your dog '" + name + "' :");
        String breed = scanner.nextLine();
        System.out.println("Input age of your dog '" + name + "' :");
        int age = scanner.nextInt();
        scanner.nextLine();

        return new Dog(name, Breed.valueOf(breed.toUpperCase()), age);
    }

    public static class Dog {
        private String name;
        private Breed breed;
        private int age;

        public Dog() {

        }

        public Dog(String name, Breed breed, int age) {
            this.name = name;
            this.breed = breed;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Breed getBreed() {
            return breed;
        }

        public void setBreed(Breed breed) {
            this.breed = breed;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;

            if (oldestDogAge < age) {
                oldestDogAge = age;
                nameOldestDog = this.name;
            }
        }
    }

    enum Breed {
        LABRADOR("Labrador"),
        BULLDOG("Bulldog"),
        POODLE("Poodle"),
        ROTTWEILER("Rottweiler");

        final String en;

        Breed(String en) {
            this.en = en;
        }
    }

}
