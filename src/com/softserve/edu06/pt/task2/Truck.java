package com.softserve.edu06.pt.task2;

public class Truck extends Car{
    private static final int PERMITTED_SPEED = 90;
    private static final int PERMITTED_CARRYING_CAPACITY = 40;
    public Truck(String modelCar, int maxSpeed, int yearOfProduction) {
        super(modelCar, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.printf("The %s accelerates to the maximum permitted speed (%d km/h) with a load of %d tons.%n", modelCar, PERMITTED_SPEED, PERMITTED_CARRYING_CAPACITY);
        int speed = 0;

        do{
            System.out.printf("Current speed: %d km/h.%n", speed);
            speed += 6;
            timeSimulation();
        }while (speed < PERMITTED_SPEED);

        System.out.println("The truck reached the maximum permitted speed.");
    }

    @Override
    public void stop() {
        System.out.printf("The %s starts braking at %d km/h with a %d-ton load.%n", modelCar, PERMITTED_SPEED, PERMITTED_CARRYING_CAPACITY);
        int speed = PERMITTED_SPEED;

        do{
            System.out.printf("Current speed: %d km/h.%n", speed);
            speed -= 8;
            timeSimulation();
        }while (speed > 0);

        System.out.println("The truck has stopped.");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "modelCar='" + modelCar + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
