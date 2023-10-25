package com.softserve.edu11.pt.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestTask3 {
    @ParameterizedTest
    @MethodSource("provideTestData")
    void testIsValidName(String name, boolean output){
        var actual = Task3.isValidName(name);

        Assertions.assertEquals(output, actual);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of("SwiftStar_7", true),
                Arguments.of("Богдан", false),
                Arguments.of("NeoTech42", true),
                Arguments.of("MaxPower_X", true),
                Arguments.of("Luna!", false),
                Arguments.of("Lu", false),
                Arguments.of("Luna_Luna_Luna_Luna", false)
        );
    }
}
