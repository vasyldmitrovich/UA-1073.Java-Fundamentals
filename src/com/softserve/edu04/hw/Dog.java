package com.softserve.edu04.hw;

import java.util.Scanner;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    //Add constructors without and with parameters

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

    public void promptValues() {
        Scanner console = new Scanner(System.in);
        System.out.print("Dog name: ");
        String name = console.nextLine();
        System.out.print("Dog breed: ");
        String enteredBreed = console.nextLine();
        Breed breed = Breed.valueOf(enteredBreed.toUpperCase());
        System.out.print("Dog age: ");
        int age = console.nextInt();
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void printValues() {
        System.out.println("Dog name: " + name + "\n");
        System.out.println("Dog breed: " + breed + "\n");
        System.out.println("Dog age: " + age + "\n");
    }
}
