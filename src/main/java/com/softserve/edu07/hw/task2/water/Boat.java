package com.softserve.edu07.hw.task2.water;

import com.softserve.edu07.hw.task2.abstract_element.WaterVehicle;

public class Boat extends WaterVehicle {
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
    public void isSailing() {
        System.out.println("The boat is sailing.");
    }
}
