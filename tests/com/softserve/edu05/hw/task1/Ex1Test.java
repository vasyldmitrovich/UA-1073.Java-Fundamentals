package com.softserve.edu05.hw.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Ex1Test {

    @Test
    void obtainDaysInJan() {
        assertEquals(31, Ex1.obtainDaysInMonth(1), "Days in Jan is wrong!!!");
    }

    @Test
    void obtainDaysInFeb() {
        assertEquals(28, Ex1.obtainDaysInMonth(2), "Days in Feb is wrong!!!");
    }

    @Test
    void obtainDaysInNov() {
        assertEquals(30, Ex1.obtainDaysInMonth(11), "Days in Nov is wrong!!!");
    }

    @Test
    void obtainDaysException() {
        ArrayIndexOutOfBoundsException thrown =
                Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,
                        () -> {
                            Ex1.obtainDaysInMonth(0);
                        });

    }

    @Test
    void validMonthNum() {
        assertTrue( Ex1.validMonthNum(5), "Number of month is wrong!");

    }

}
