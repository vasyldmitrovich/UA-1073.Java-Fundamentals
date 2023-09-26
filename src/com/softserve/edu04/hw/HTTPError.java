package com.softserve.edu04.hw;

public enum HTTPError {
    _500("Internal Server Error"), _501("Not Implemented"),
    _502("Bad Gateway"), _503("Service Unavailable"),
    _504("Gateway Timeout"), _505("HTTP Version Not Supported"),
    _506("Variant Also Negotiates"), _507("Insufficient Storage"),
    _508("Loop Detected"), _510("Not Extended"),
    _511("Network Authentication Required");

    final String message;

    HTTPError(String message) {
        this.message = message;
    }
}
