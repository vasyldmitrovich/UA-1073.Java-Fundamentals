package com.softserve.edu05.task3;

public class Car implements Comparable {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }


    @Override
    public int compareTo(Object o) {
        if (this.yearOfProduction > ((Car) o).yearOfProduction) {
            return 1;
        } else if (this.yearOfProduction < ((Car) o).yearOfProduction) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
