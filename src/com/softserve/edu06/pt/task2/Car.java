package com.softserve.edu06.pt.task2;

public abstract class Car {
    private String model;
    private int maxSpeed;
    private int yearOfProduction;


    Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    abstract void run();


    abstract void stop();

}

//Створити абстрактний клас з іменем Car з
//- полями: model, maxSpeed та yearOfProduction;
//- методами: run() та stop().
//Створити класи з іменами Truck та Sedan, які розширюють клас Car.
//У методі main() створити масив об'єктів класу Car. Додайте в цей масив декілька
//вантажівки та седани і виведіть інформацію про них.