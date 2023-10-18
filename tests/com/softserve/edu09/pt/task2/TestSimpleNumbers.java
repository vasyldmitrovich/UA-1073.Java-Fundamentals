package com.softserve.edu09.pt.task2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSimpleNumbers {
    private SimpleNumber simpleNumber;

    @BeforeEach
    void createObject(){
        simpleNumber = new SimpleNumber();
    }

    @Test
    void testAddElementCorrect(){
        String input = "1, 2, 3, 4, 4, 5, 6, 6, 7, 8";
        Integer[] execute = {1, 2, 3, 4, 5, 6, 7, 8};

        try {
            simpleNumber.addNumbers(input);

            Integer[] actual = simpleNumber.getNumber();

            assertThat(execute)
                    .containsExactly(actual);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    void testAddElementThrowConvertException(){
        String input = "1, 2, 3.0, 4, 4, 5.8, 6, 6, 7, 8";

        try {
            simpleNumber.addNumbers(input);
            fail("The method was expected to throw an error, but the call completed successfully");
        }
        catch (Exception e){
            assertThat(e)
                    .isInstanceOf(ConvertException.class);
        }
    }
}
