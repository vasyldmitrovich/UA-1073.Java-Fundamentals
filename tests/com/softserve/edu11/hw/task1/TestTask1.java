package com.softserve.edu11.hw.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestTask1 {
    @ParameterizedTest
    @DisplayName("A method for checking the search for the longest word in a sentence.")
    @MethodSource("provideTestDataGetLongestWord")
    void testGetLongestWordFromText(String text, String expected){
        var workWithSentence = new Task1(text);
        var actual = workWithSentence.getLongestWordFromText();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @DisplayName("A method for checking the length of the longest word in a sentence.")
    @MethodSource("provideTestDataGetLongestWordNum")
    void testGetNumLettersInLongestWord(String text, int expected){
        var workWithSentence = new Task1(text);
        var actual = workWithSentence.getNumLettersInLongestWord();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @DisplayName("A method for checking the output of the second word in a sentence in reverse order.")
    @MethodSource("provideTestDataGetReversSecondWord")
    void testGetReversSecondWord(String text, String expected){
        var workWithSentence = new Task1(text);
        var actual = workWithSentence.getReversSecondWord();

        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideTestDataGetLongestWord(){
        return Stream.of(
                Arguments.of("The sun sets, painting the sky.", "painting"),
                Arguments.of("Laughter echoes through the empty streets.", "Laughter"),
                Arguments.of("Dreams bloom in the quiet night.", "Dreams"),
                Arguments.of("Waves dance along the moonlit shore.", "moonlit"),
                Arguments.of("Whispers of wind carry secrets afar.", "Whispers")
        );
    }

    private static Stream<Arguments> provideTestDataGetLongestWordNum(){
        return Stream.of(
                Arguments.of("The sun sets, painting the sky.", 8),
                Arguments.of("Laughter echoes through the empty streets.", 8),
                Arguments.of("Dreams bloom in the quiet night.", 6),
                Arguments.of("Waves dance along the moonlit shore.", 7),
                Arguments.of("Whispers of wind carry secrets afar.", 8)
        );
    }

    private static Stream<Arguments> provideTestDataGetReversSecondWord(){
        return Stream.of(
                Arguments.of("The sun sets, painting the sky.", "nus"),
                Arguments.of("Laughter echoes through the empty streets.", "seohce"),
                Arguments.of("Dreams bloom in the quiet night.", "moolb"),
                Arguments.of("Waves dance along the moonlit shore.", "ecnad"),
                Arguments.of("Whispers of wind carry secrets afar.", "fo")
        );
    }
}
