package com.softserve.edu07.hw.task2.groundVehicle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GroundVehicleTest {
    ByteArrayOutputStream os;
    private PrintStream oldOut;

    @BeforeEach
    void beforeEach () {
        oldOut = System.out;
        os = new ByteArrayOutputStream();
        System.setOut(new PrintStream(os));
    }

    @AfterEach
    void afterEach () {
        System.setOut(oldOut);
    }

    @Test
    @DisplayName("Bus should drive")
    void driveBus () {
        Bus bus = new Bus(52, "route");

        bus.drive();

        assertTrue(os.toString()
                        .stripTrailing()
                        .equals("Drive bus"),
                "The output is: " + os);
    }

    @Test
    @DisplayName("Car should drive")
    void driveCar () {
        Car car = new Car(52, "model");

        car.drive();

        assertTrue(os.toString()
                        .stripTrailing()
                        .equals("Drive car"),
                "The output is: " + os);
    }

    @Test
    @DisplayName("Car should drive")
    void driveMotorcycle () {
        Motorcycle motorcycle = new Motorcycle(52, 100);

        motorcycle.drive();

        assertTrue(os.toString()
                        .stripTrailing()
                        .equals("Drive motorcycle"),
                "The output is: " + os);
    }

}