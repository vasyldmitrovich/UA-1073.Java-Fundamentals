package com.softserve.edu05.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testSortByYearOfProduction() {
        Car car1 = new Car();
        car1.setType("Crossover");
        car1.setYearOfProduction(2008);
        car1.setEngineCapacity(1);
        Car car2 = new Car();
        car2.setType("Sports");
        car2.setYearOfProduction(2012);
        car2.setEngineCapacity(0.8);
        Car car3 = new Car();
        car3.setType("Family");
        car3.setYearOfProduction(1995);
        car3.setEngineCapacity(0.9);
        Car car4 = new Car();
        car4.setType("Minivan");
        car4.setYearOfProduction(2005);
        car4.setEngineCapacity(1);


        Car[] unsortedCars = {car1, car2, car3, car4};
        Car[] expectedSortedCars = {car3, car4, car1, car2};

        App.sort(unsortedCars);

        assertArrayEquals(expectedSortedCars, unsortedCars);
    }
}