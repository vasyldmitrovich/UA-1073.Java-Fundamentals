package com.softserve.edu12.hw.task2;

public class LimitExceededException extends RuntimeException{
    public LimitExceededException(String message) {
        super(message);
    }
}
