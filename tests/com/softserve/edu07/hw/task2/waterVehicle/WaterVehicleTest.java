package com.softserve.edu07.hw.task2.waterVehicle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class WaterVehicleTest {
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
    @DisplayName("Boat should sail")
    void isSailingBoat () {
        Boat boat = new Boat(100, 100);

        boat.isSailing();

        assertTrue(os.toString()
                        .stripTrailing()
                        .equals("Sailing boat"),
                "The output is: " + os);
    }

    @Test
    @DisplayName("Liner should sail")
    void isSailingLiner () {
        Liner liner = new Liner(100, 2);

        liner.isSailing();

        assertTrue(os.toString()
                        .stripTrailing()
                        .equals("Sailing liner"),
                "The output is: " + os);
    }
}