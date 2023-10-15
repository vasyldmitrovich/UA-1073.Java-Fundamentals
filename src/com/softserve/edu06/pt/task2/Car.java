package com.softserve.edu06.pt.task2;
abstract class Car {
    private String model;
    private int yearOfProduction;
    private int maxSpeed;


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public Car(String model, int yearOfProduction, int maxSpeed) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.maxSpeed = maxSpeed;

    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    abstract void run();
    abstract void stop();
}
