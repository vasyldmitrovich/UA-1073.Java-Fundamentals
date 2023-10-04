package com.softserve.edu05.hw;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;

public class Car {
    private static Comparator<Car> CarYearComparator = new Comparator<Car>() {
        @Override
        public int compare (Car car1, Car car2) {
            return car1.compareTo(car2);
        };
    };

    private String type;
    private int year;
    private int engineCapacity;

    public Car () {
        this("", Calendar.getInstance().get(Calendar.YEAR), 0);
    }

    public Car (String type, int year, int engineCapacity) {
        this.type = type;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public static Car[] filterByYear (Car[] cars, int year) {
        var filteredCars = new ArrayList<Car>();

        for (Car car : cars) {
            if (car.getYear() == year) {
                filteredCars.add(car);
            }
        }

        return filteredCars.toArray(new Car[filteredCars.size()]);
    }

    public static void sortByYears (Car[] cars) {
        Arrays.sort(cars, CarYearComparator);
    }

    public int compareTo (Car car) {
        int compareYear = car.getYear();

        return this.year - compareYear;
    }

    public String getType () {
        return type;
    }

    public void setType (String type) {
        this.type = type;
    }

    public int getYear () {
        return year;
    }

    public void setYear (int year) {
        this.year = year;
    }

    public int getEngineCapacity () {
        return engineCapacity;
    }

    public void setEngineCapacity (int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString () {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
