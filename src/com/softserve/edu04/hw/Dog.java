package com.softserve.edu04.hw;

import java.util.Objects;
import java.util.Scanner;

public class Dog implements Comparable {
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

    public void input(){//This method move in the end of class, after getters and setters
        Scanner scanner = new Scanner(System.in);
        String name;
        String breed;
        int age;

        System.out.print("Enter the dog's name: ");
        name = scanner.nextLine();

        int index = 1;
        System.out.println("\nList of breed:");
        for(var b : Breed.values()){
            System.out.printf("\t%d. %s\n", index++, b.getTitleEM());
        }

        System.out.print("Enter the dog breed: ");
        breed = scanner.nextLine();
        breed = breed.replace(" ", "_");

        System.out.print("Enter the dog's age: ");
        age = scanner.nextInt();

        setName(name);
        setBreed(Breed.valueOf(breed.toUpperCase()));
        setAge(age);
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
    }

    public boolean equalsName(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        if (o == null || getClass() != o.getClass()) return 1;
        Dog dog = (Dog) o;
        return Integer.compare(this.age, dog.age);
    }
}

enum Breed{//Move to file Breed.java
    LABRADOR_RETRIEVER("Labrador Retriever"),
    GERMAN_SHEPHERD ("German Shepherd"),
    BULLDOG("Bulldog"),
    GOLDEN_RETRIEVER("Golden Retriever"),
    SIBERIAN_HUSKY("Siberian Husky");

    private final String titleEM;

    Breed(String titleEM){
        this.titleEM = titleEM;
    }

    public String getTitleEM(){
        return titleEM;
    }
}
