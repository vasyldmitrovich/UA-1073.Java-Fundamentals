package com.softserve.edu07.hw.task2.ground;

import com.softserve.edu07.hw.task2.abstract_element.GroundVehicle;

public class Bus extends GroundVehicle {
    private String route;

    public Bus(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.printf("The bus runs on the %s route.%n", route);
    }
}
