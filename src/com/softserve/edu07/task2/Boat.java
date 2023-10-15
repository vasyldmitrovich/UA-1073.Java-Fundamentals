package com.softserve.edu07.task2;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat(int passengers) {
        super(passengers);
    }

    @Override
    public void isSailing() {
        System.out.println("Boat is sailing... " + "\nIt has " + volume + " volume and " + getPassengers() + " passengers.");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
