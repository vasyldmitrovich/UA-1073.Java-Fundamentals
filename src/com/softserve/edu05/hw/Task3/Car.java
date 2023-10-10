package com.softserve.edu05.hw.Task3;

public class Car {
    private String type;
    private int yearProdaction;
    private double engineCapacity;

    public Car(String type, int yearProdaction, double engineCapacity) {
        this.type = type;
        this.yearProdaction = yearProdaction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearProdaction() {
        return yearProdaction;
    }

    public void setYearProdaction(int yearProdaction) {
        this.yearProdaction = yearProdaction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car type: " + type + ", year of production: " + yearProdaction +
                ", engine capacity: " + engineCapacity + '.';
    }
}