package com.softserve.edu11.pt.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestTask2 {
    @ParameterizedTest
    @MethodSource("provideTestData")
    void testFormatText(String firstName, String lastName, String middleName, String output){
        var actual = Task2.formatText(firstName, lastName, middleName);

        Assertions.assertEquals(output, actual);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of("Lila", "Thorne", "Marie", "Thorne L.M.\nLila\nLila Marie Thorne"),
                Arguments.of("Carlos", "Rodriguez", "Alejandro", "Rodriguez C.A.\nCarlos\nCarlos Alejandro Rodriguez"),
                Arguments.of("Olivia", "Jenkins", "Grace", "Jenkins O.G.\nOlivia\nOlivia Grace Jenkins"),
                Arguments.of("Ethan", "Chen", "James", "Chen E.J.\nEthan\nEthan James Chen")
        );
    }
}
