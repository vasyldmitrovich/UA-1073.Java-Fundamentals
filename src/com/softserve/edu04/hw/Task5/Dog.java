package com.softserve.edu04.hw.task5;

import java.util.Objects;

public class Dog {
    String name;//Make fields private
    String breed;
    int age;

    public Dog(String name, String breed, int age) {
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    public static Dog theOldestDog(
            Dog dog1,
            Dog dog2,
            Dog dog3
    ) {//Move this method to class Task5.java, this method should not be here
        Dog res = dog1;
        if (dog2.getAge() > res.getAge()) {
            res = dog2;
        }
        if (dog3.getAge() > res.getAge()) {
            res = dog3;
        }
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name) && Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age);
    }

    public static boolean sameName(Dog dog1, Dog dog2, Dog dog3) {
       return (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName())||
               dog2.getName().equals(dog3.getName()));
}
    public static void checkIfHaveSameName () {
        if (Main.sameName == true) {
            System.out.println("We have two dogs with the same name!");
        } else {
            System.out.println("All dogs have different names");
        }
    }
}