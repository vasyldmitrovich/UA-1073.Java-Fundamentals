package com.softserve.edu04.hw;

public enum HTTPError {
    BAD_REQUEST("400 Bad Request"), UNAUTHORIZED("401 Unauthorized"),
    PAYMENT_REQUIRED("402 Payment Required"), FORBIDDEN("403 Forbidden"),
    NOT_FOUND("404 Not Found"), METHOD_NOT_ALLOWED("405 Method Not Allowed"),
    NOT_ACCEPTABLE("406 Not Acceptable");

    final String errorMessage;

    HTTPError(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
