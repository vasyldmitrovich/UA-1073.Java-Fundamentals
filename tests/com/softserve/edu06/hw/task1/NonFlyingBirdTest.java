package com.softserve.edu06.hw.task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class NonFlyingBirdTest {
    private PrintStream oldOut;
    ByteArrayOutputStream os;
    private final String ExpectedFlyText = "Oops, I'm falling";

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
    @DisplayName("Non flying bird shouldn't fly")
    void fly () {
        NonFlyingBird nonFlyingBird = new NonFlyingBird(true, "feathers");
        nonFlyingBird.fly();

        assertTrue(os.toString()
                        .stripTrailing()
                        .equals(ExpectedFlyText),
                "The output is: " + os);
    }

    @Test
    @DisplayName("Kiwi shouldn't fly")
    void flyKiwi () {
        Kiwi kiwi = new Kiwi(true, "feathers");
        kiwi.fly();

        assertTrue(os.toString()
                        .stripTrailing()
                        .equals(ExpectedFlyText),
                "The output is: " + os);
    }

    @Test
    @DisplayName("Penguin shouldn't fly")
    void flyPenguin () {
        Penguin penguin = new Penguin(true, "feathers");
        penguin.fly();

        assertTrue(os.toString()
                        .stripTrailing()
                        .equals(ExpectedFlyText),
                "The output is: " + os);
    }
}