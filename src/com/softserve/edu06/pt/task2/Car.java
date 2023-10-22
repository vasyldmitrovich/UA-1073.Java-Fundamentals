package com.softserve.edu06.pt.task2;

public abstract class Car {
    protected String modelCar;
    protected int maxSpeed;
    protected int yearOfProduction;

    protected Car(String modelCar, int maxSpeed, int yearOfProduction) {
        this.modelCar = modelCar;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void run();
    public abstract void stop();

    protected void timeSimulation(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Oops, something went wrong");
        }
    }
}
