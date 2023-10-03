package com.softserve.edu04.hw.Task3;

public enum HTTPError {
    ERROR101 ("Switching Protocols"),
    ERROR102 ("Processing"),
    ERROR103 ("Early Hints"),
    ERROR400 ("Bad Request"),
    ERROR404 ("Not Found"),
    ERROR414 ("URI Too Long");

    final String errorName;

    HTTPError(String errorName) {
        this.errorName = errorName;
    }
}
