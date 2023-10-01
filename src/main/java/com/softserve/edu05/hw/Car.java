package com.softserve.edu05.hw;

public class Car implements Comparable<Car> {
    private TypeCar type;
    private int yearProduction;
    private double engineCapacity;

    public static Car[] getCertainModelYear(Car[] array, int year){
        Car[] buffer = new Car[array.length];
        int bufferIndex = 0;

        for(Car car : array){
            if(car.yearProduction == year){
                buffer[bufferIndex++] = car;
            }
        }

        Car[] result = new Car[bufferIndex];
        System.arraycopy(buffer, 0, result, 0, bufferIndex);

        return result;
    }

    public Car(TypeCar type, int yearProduction, double engineCapacity) {
        this.type = type;
        this.yearProduction = yearProduction;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", yearProduction=" + yearProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    @Override
    public int compareTo(Car anotherCar) {
        return Integer.compare(this.yearProduction, anotherCar.yearProduction);
    }
}

enum TypeCar{
    SEDAN, SUV, HATCHBACK, COUPE, CROSSOVER
}
