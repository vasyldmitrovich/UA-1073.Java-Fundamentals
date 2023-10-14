package com.softserve.edu07.hw.hw2;

class Boat extends WaterVehicle{
    private int volume;

    public Boat() {
    }

    @Override
    void isSailing() {
        System.out.println("Boat starts sail");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
