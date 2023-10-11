package com.softserve.edu05.pt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @Test
    void main() {
        int[] arr = {1, 2};
        int[] expected = {2, 1};
        assertArrayEquals(expected, arr);
    }
}