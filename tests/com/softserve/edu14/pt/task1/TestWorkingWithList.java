package com.softserve.edu14.pt.task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class TestWorkingWithList {
    private static List<String> list;

    @BeforeEach
    void createList(){
        list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
    }

    @Test
    void testNumEmptyLines(){
        long expected = 2;
        long num = WorkingWithList.numEmptyLines(list);

        assertEquals(expected, num);
    }

    @Test
    void testRemoveEmptyLines(){
        List<String> expected = Arrays.asList("bla", "simp", "second", "third", "third", "sec", "blablabla");
        list = WorkingWithList.removeEmptyLines(list);

        assertEquals(expected, list);
    }

    @Test
    void testUppercaseAndJoin(){
        String expected = "BLA,,SIMP,,SECOND,THIRD,THIRD,SEC,BLABLABLA";
        String result = WorkingWithList.uppercaseAndJoin(list);

        assertEquals(expected, result);
    }
}
