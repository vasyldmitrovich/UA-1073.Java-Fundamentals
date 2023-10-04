package com.softserve.edu06.pt.task2;

public class Sedan extends Car{
    public Sedan(String modelCar, int maxSpeed, int yearOfProduction) {
        super(modelCar, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.printf("%s accelerates to its top speed (%d km/h).%n", modelCar, maxSpeed);
        int speed = 0;

        do{
            System.out.printf("Current speed: %d km/h%n", speed);
            speed += 32;
            timeSimulation();
        }while (speed < maxSpeed);

        System.out.println("The car reached its maximum speed.");
    }

    @Override
    public void stop() {
        System.out.printf("%s starts braking from top speed (%dkm/h).%n", modelCar, maxSpeed);
        int speed = maxSpeed;

        do{
            System.out.printf("Current speed: %d km/h%n", speed);
            speed -= 40;
            timeSimulation();
        }while (speed > 0);

        System.out.println("The car has stopped");
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "modelCar='" + modelCar + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
