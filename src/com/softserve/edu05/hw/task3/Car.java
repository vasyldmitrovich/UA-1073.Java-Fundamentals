package com.softserve.edu05.hw.task3;

public class Car {
    private String type;
    private int yearOfProductino;
    private double engineCapacity;

    //Write constructor without parameters

    public Car(String type, int yearOfProductino, double engineCapacity) {
        this.type = type;
        this.yearOfProductino = yearOfProductino;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProductino() {
        return yearOfProductino;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    //Add setters  toString equals and HashCode
}
