package com.softserve.edu06.hw.task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class FlyingBirdTest {
    private PrintStream oldOut;
    ByteArrayOutputStream os;
    private final String ExpectedFlyText = "I'm flying";

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
    @DisplayName("Flying bird should fly")
    void fly () {
        FlyingBird flyingBird = new FlyingBird(true, "feathers");
        flyingBird.fly();


        assertTrue(os.toString()
                        .stripTrailing()
                        .equals(ExpectedFlyText),
                "The output is: " + os);
    }

    @Test
    @DisplayName("Swallow bird should fly")
    void flySwallow () {
        Swallow swallow = new Swallow(true, "feathers");
        swallow.fly();

        assertTrue(os.toString()
                        .stripTrailing()
                        .equals(ExpectedFlyText),
                "The output is: " + os);
    }

    @Test
    @DisplayName("Eagle bird should fly")
    void flyEagle () {
        Eagle eagle = new Eagle(true, "feathers");
        eagle.fly();

        assertTrue(os.toString()
                        .stripTrailing()
                        .equals(ExpectedFlyText),
                "The output is: " + os);
    }
}