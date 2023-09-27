package com.softserve.edu04.hw.task5;

import com.softserve.edu04.hw.task4.Season;

import java.util.Objects;
import java.util.Scanner;

public class Dog {
    private String name;
    private Breed breed;
    private int age;



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
    }

    public void loadData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dog name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter breed: ");
        this.breed = Breed.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Enter age: ");
        this.age = scanner.nextInt();
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (age != dog.age) return false;
        if (!name.equals(dog.name)) return false;
        return breed == dog.breed;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (breed != null ? breed.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }
}
