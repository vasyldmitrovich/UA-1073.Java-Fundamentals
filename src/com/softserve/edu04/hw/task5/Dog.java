package com.softserve.edu04.hw.task5;

public class Dog {
    private String name;
    private int age;
    private Breed breed;

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed=" + breed +
                '}';
    }

    //Метод визначення найстарійшої собаки
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