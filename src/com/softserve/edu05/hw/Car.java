package com.softserve.edu05.hw;

class Car {

    private final String type;
    private final int year;
    private final double engineCapacity;


    Car(String type, int year, double engineCapacity) {
        this.type = type;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car - " + getType() + ", year of production - " + getYear() +
                ", engine capacity - " + getEngineCapacity();
    }



}
