package com.softserve.edu04.hw.Task5;

public class Dog {
    private String dogName;
    private String dogBreed;
    private int dogAge;

    public Dog(String dogName, String dogBreed, int dogAge) {
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.dogAge = dogAge;
    }

    public String getDogName() {
        return dogName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public int getDogAge() {
        return dogAge;
    }
}
