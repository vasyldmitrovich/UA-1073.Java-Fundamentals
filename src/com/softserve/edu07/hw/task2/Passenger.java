package com.softserve.edu07.hw.task2;

abstract class Passenger {

    private int passengers;

    public Passenger(int passengers) {
        this.passengers = passengers;
    }

    public int getPassenger() {
        return passengers;
    }

    public void setPassenger(int passengers) {
        this.passengers = passengers;
    }
}
