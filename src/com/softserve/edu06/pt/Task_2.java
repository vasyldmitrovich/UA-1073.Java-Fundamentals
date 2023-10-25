package com.softserve.edu06.pt;

public class Task_2 {
    public static void main(String[] args) {
        Car[] cars = {
                new Sedan("BMW X6", 2020,200),
                new Truck("MAN",2015,110)
        };

        for (var car:cars) {
            car.run();
        }
        for (var car:cars) {
            car.stop();
        }
        for (var car:cars) {
            System.out.println(car);
        }


    }
}

abstract class Car{
    private String model;
    private int yearOfProduction;
    private int maxSpeed;

    public Car(String model, int yearOfProduction, int maxSpeed) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.maxSpeed = maxSpeed;
    }

    abstract void run();
    abstract void stop();

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

class Sedan extends Car{
    public Sedan(String model, int yearOfProduction, int maxSpeed) {
        super(model, yearOfProduction, maxSpeed);
    }

    @Override
    void run() {
        System.out.println("Sedan " + getModel() + " starts moving ");
    }

    @Override
    void stop() {
        System.out.println("Sedan " + getModel() + " stop moving ");

    }

    @Override
    public String toString() {
        return "Sedan{" +
                "model='" + getModel() + '\'' +
                ", yearOfProduction=" + getYearOfProduction() +
                ", maxSpeed=" + getMaxSpeed() +
                '}';
    }
}

class Truck extends Car{
    public Truck(String model, int yearOfProduction, int maxSpeed) {
        super(model, yearOfProduction, maxSpeed);
    }

    @Override
    void run() {
        System.out.println("Truck " + getModel() + " starts moving ");
    }

    @Override
    void stop() {
        System.out.println("Truck " + getModel() + " stop moving ");

    }


    @Override
    public String toString() {
        return "Truck{" +
                "model='" + getModel() + '\'' +
                ", yearOfProduction=" + getYearOfProduction() +
                ", maxSpeed=" + getMaxSpeed() +
                '}';
    }
}
