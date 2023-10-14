package com.softserve.edu07.hw.hw2;

class Liner extends WaterVehicle{
    private int floors;

    public Liner() {
    }

    @Override
    void isSailing() {
        System.out.println("Liner starts sail");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
