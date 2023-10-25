package com.softserve.edu11.hw.task3;

import com.softserve.edu11.hw.task2.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestTask3 {
    @ParameterizedTest
    @DisplayName("The checking method replaces all duplicate spaces with a single space.")
    @MethodSource("provideTestData")
    void testGetAllUSCurrency(String text, String expected){
        var actual = Task3.getAllUSCurrency(text);

        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of("The new smartphone is priced at $999.", ""),
                Arguments.of("She carefully checked the price tag, which read $49.99.", "$49.99"),
                Arguments.of("Prices for luxury items often fluctuate, but this watch costs $.50.", ""),
                Arguments.of("Online shopping platforms highlight competitive prices for tech gadgets, ranging from $299.00 to $699.00.", "$299.00 $699.00"),
                Arguments.of("", "")
        );
    }
}
