package com.softserve.edu06.pt;


abstract class Car {
    protected String model;
    protected int maxSpeed;
    protected int yearOfProduction;

    public abstract void run();

    public abstract void stop();
}

class Truck extends Car {

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}

class Sedan extends Car {


    @Override
    public void run() {
    }

    @Override
    public void stop() {

    }
}

public class pt2 {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Truck();
        cars[1] = new Sedan();


        for (Car car : cars) {
            System.out.println("Model: " + car.model + ", Max Speed: " + car.maxSpeed + ", Year: " + car.yearOfProduction);
            car.run();
            car.stop();
        }
    }
}


