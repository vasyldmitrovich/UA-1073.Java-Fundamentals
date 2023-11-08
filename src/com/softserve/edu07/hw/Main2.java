package com.softserve.edu07.hw;

import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {


        Boat boat = new Boat();
        Plane plane = new Plane();
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(boat);
        vehicles.add(plane);
        vehicles.add(car);
        vehicles.add(motorcycle);

        System.out.println("Чи плаває човен? " + boat.isSailing());
        System.out.println("Чи літає літак? " + plane.fly());
        System.out.println("Чи рухається автомобіль? " + car.drive());
        System.out.println("Чи рухається мотоцикл? " + motorcycle.drive());

        System.out.println("Об'єм човна: " + boat.getVolume());
        System.out.println("Максимальна відстань польоту літака: " + plane.getMaxDistance());
        System.out.println("Максимальна швидкість автомобіля: " + car.getMaxSpeed());
        System.out.println("Максимальна швидкість мотоцикла: " + motorcycle.getMaxSpeed());

        for (Vehicle vehicle : vehicles) {
            vehicle.drive();
        }

        plane.fly();

        plane.land();

        motorcycle.setMaxSpeed(200);

        System.out.println("Максимальна швидкість мотоцикла: " + motorcycle.getMaxSpeed());
    }

}
