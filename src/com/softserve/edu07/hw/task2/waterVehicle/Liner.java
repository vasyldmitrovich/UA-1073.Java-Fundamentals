package com.softserve.edu07.hw.task2.waterVehicle;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner (int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    @Override
    void isSailing () {
        System.out.println("Sailing liner");
    }
}
