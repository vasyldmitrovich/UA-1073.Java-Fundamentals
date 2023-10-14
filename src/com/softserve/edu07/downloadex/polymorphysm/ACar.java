package com.softserve.edu07.downloadex.polymorphysm;

public abstract class ACar {
    private double maxSpeed;

    public double getMaxSpeed( ) { return maxSpeed; }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    abstract void carRides( );
}
