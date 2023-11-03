package com.softserve.edu07.hw;

public class Task_2 {

}

interface Vehicle {
};

abstract class Passengers {
};

abstract class WaterVehicle extends Passengers implements Vehicle {
    public WaterVehicle() {
    }

    abstract void inSailing();
}

class Liner extends WaterVehicle {
    public Liner(int floors) {
        this.floors = floors;
    }

    private int floors;

    public void setFloors(int floors) {
        this.floors = floors;
    }

    void inSailing() {

    }

    public int getFloors() {
        return floors;
    }
}

class Boat extends WaterVehicle {

    private int volume;

    public Boat(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    void inSailing() {

    }
}

abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle() {
    }

    abstract void fly();

    abstract void land();
}

class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    void fly() {

    }

    @Override
    void land() {

    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}

class Helicopter extends FlyingVehicle {
    public Helicopter(int weight, int maxHeight) {
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    private int weight;
    private int maxHeight;

    @Override
    void fly() {

    }

    @Override
    void land() {

    }
}

abstract class GroundVehicle extends Passengers implements Vehicle {
    public GroundVehicle() {
    }

    abstract void drive();
}

class Bus extends GroundVehicle {
    public Bus(String route) {
        this.route = route;
    }

    private String route;

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    void drive() {

    }
}

class Motorcycle extends GroundVehicle {
    public Motorcycle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    private int maxSpeed;

    @Override
    void drive() {

    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

class Car extends GroundVehicle {
    public Car(String model) {
        this.model = model;
    }

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    void drive() {

    }
}