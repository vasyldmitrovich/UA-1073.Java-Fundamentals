package com.softserve.edu07.hw.task2;

public abstract class Passengers {//without s in the end name of class
    private int passengers;

    public Passengers (int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers () {
        return passengers;
    }

    public void setPassengers (int passengers) {
        this.passengers = passengers;
    }
}
