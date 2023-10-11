package com.softserve.edu07.hw.task2.groundVehicle;

import com.softserve.edu07.hw.task2.groundVehicle.GroundVehicle;

public class Bus extends GroundVehicle {
    private String route;

    public Bus (int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    public String getRoute () {
        return route;
    }

    public void setRoute (String route) {
        this.route = route;
    }

    @Override
    void drive () {
        System.out.println("Drive bus");
    }
}
