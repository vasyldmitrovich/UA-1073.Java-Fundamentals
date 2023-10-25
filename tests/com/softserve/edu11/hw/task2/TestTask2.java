package com.softserve.edu11.hw.task2;

import com.softserve.edu11.hw.task1.Task1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestTask2 {
    @ParameterizedTest
    @DisplayName("The checking method replaces all duplicate spaces with a single space.")
    @MethodSource("provideTestData")
    void testGetLongestWordFromText(String text, String expected){
        var actual = Task2.replaceAllConsecutiveSpacesSingleSpace(text);

        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of("The sun sets, painting the sky.", "The sun sets, painting the sky."),
                Arguments.of("Laughter      echoes through the      empty streets.", "Laughter echoes through the empty streets."),
                Arguments.of("Dreams               bloom in the quiet   night.", "Dreams bloom in the quiet night."),
                Arguments.of("", "")
        );
    }
}
