package com.softserve.edu11.hw.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestTask4 {
    @ParameterizedTest
    @DisplayName("A method for verifying that first and last names match the template.")
    @MethodSource("provideTestDataInputData_Correct")
    void testInputData_Correct(String firstName, String lastName, boolean expected) throws NameException {
        var container = new Task4();
        var isCorrect = container.inputData(firstName, lastName);

        Assertions.assertEquals(expected, isCorrect);
    }

    @ParameterizedTest
    @DisplayName("A method for checking first and last names that do not match the template.")
    @MethodSource("provideTestDataInputData_Wrong")
    void testInputData_Throw(String firstName, String lastName) {
        var container = new Task4();

        Assertions.assertThrows(NameException.class, () -> container.inputData(firstName, lastName));
    }

    private static Stream<Arguments> provideTestDataInputData_Correct(){
        return Stream.of(
                Arguments.of("Lila", "Thorne", true),
                Arguments.of("Ethan James", "Chen", true),
                Arguments.of("Ethan-James", "Chen", true)
        );
    }

    private static Stream<Arguments> provideTestDataInputData_Wrong(){
        return Stream.of(
                Arguments.of("Lila12", "Thorne"),
                Arguments.of("Carlos", "Rodriguez!"),
                Arguments.of("O*livia", "Jenkins"),
                Arguments.of("Ethan James", "Che32n"),
                Arguments.of("Ethan-James", "Chen5"),
                Arguments.of("", "")
        );
    }
}
