package com.softserve.edu07.hw.task2.water;

import com.softserve.edu07.hw.task2.abstract_element.WaterVehicle;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner(int floors) {
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.println("The liner does not sail.");
    }
}
