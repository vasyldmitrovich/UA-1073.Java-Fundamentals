package com.softserve.edu07.task2;

public class Bus extends GroundVehicle {
    private String route;

    public Bus(int passengers) {
        super(passengers);
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("Bus is driving to " + route +
                ". It has " + getPassengers() + " passengers on board.");
    }

}
