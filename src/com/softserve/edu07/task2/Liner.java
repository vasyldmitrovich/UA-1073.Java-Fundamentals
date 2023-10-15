package com.softserve.edu07.task2;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner(int passengers) {
        super(passengers);
    }

    @Override
    public void isSailing() {
        System.out.println("Liner is sailing..." + "\nIt has " + floors + " floors and " + getPassengers() + " passengers");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
