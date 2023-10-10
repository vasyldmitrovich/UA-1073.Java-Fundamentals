package com.softserve.edu04.hw.Task3;

public class HTTPError {
    enum HTTPEror {//Move to file HTTPError.java
        HTTP_400("Bad Request"),
        HTTP_401("Unauthorized"),
        HTTP_402("Payment Required");

        final String error;


        HTTPEror(String error) {
            this.error = error;
        }
    }
}

