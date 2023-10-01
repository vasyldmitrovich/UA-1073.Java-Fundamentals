package com.softserve.edu04.hw.task5;

public class Task5 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bob", 3, Breed.POODLE);
        Dog dog2 = new Dog("Alen", 5, Breed.PITBULL);
        Dog dog3 = new Dog("Mark", 8, Breed.DOBERMAN);

        boolean hasSameName =
                dog1.getName().equals(dog2.getName());
        hasSameName |= dog2.getName().equals(dog3.getName());
        hasSameName |= dog1.getName().equals(dog3.getName());
        System.out.println(hasSameName ? "There are dogs with same names" : "There are no dogs with same names");
        Dog oldest = dog1;
        if (dog2.getAge() > oldest.getAge()) {
            oldest = dog2;
        }
        if (dog3.getAge() > oldest.getAge()) {
            oldest = dog3;
        }
        System.out.printf
                ("The oldest dog name is %s it is a %s%n"
                        , oldest.getName(), oldest.getBreed().name().toLowerCase());


    }
}


enum Breed {
    PITBULL,
    POODLE,
    DOBERMAN;

}

class Dog {
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

}
