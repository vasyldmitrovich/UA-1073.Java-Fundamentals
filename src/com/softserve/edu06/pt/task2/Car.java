package com.softserve.edu06.pt.task2;

abstract class Car {
    private int yearOfProduction;
    private String model;
    private int maxSpeed;

    public Car(int yearOfProduction, String model, int maxSpeed) {
        this.yearOfProduction = yearOfProduction;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    abstract void run();
    abstract void stop();

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearOfProduction=" + yearOfProduction +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
