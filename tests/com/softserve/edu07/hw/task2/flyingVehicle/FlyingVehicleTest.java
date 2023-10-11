package com.softserve.edu07.hw.task2.flyingVehicle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FlyingVehicleTest {
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
    @DisplayName("Plane should fly")
    void flyPlane () {
        Plane plane = new Plane(50, 100);

        plane.fly();

        assertTrue(os.toString()
                        .stripTrailing()
                        .equals("Fly plane"),
                "The output is: " + os);
    }

    @Test
    @DisplayName("Plane should land")
    void landPlane () {
        Plane plane = new Plane(50, 100);

        plane.land();

        assertTrue(os.toString()
                        .stripTrailing()
                        .equals("Land plane"),
                "The output is: " + os);
    }


    @Test
    @DisplayName("Helicopter should fly")
    void flyHelicopter () {
        Plane plane = new Plane(50, 100);

        plane.fly();

        assertTrue(os.toString()
                        .stripTrailing()
                        .equals("Fly helicopter"),
                "The output is: " + os);
    }

    @Test
    @DisplayName("Helicopter should land")
    void landHelicopter () {
        Plane plane = new Plane(50, 100);

        plane.land();

        assertTrue(os.toString()
                        .stripTrailing()
                        .equals("Land helicopter"),
                "The output is: " + os);
    }


}