package com.softserve.edu04.hw;

import static com.softserve.edu04.hw.App.SCANNER;

public class HTTPErrorCheck {
    public HTTPErrorCheck() {
        System.out.println("Print HTTP Error");
        int httpCode = SCANNER.nextInt();
        SCANNER.nextLine();

        HTTPError error = HTTPError.valueOf("_"+httpCode);
        System.out.println(error.getTitle());
    }
}

enum HTTPError {
    _400("Bad Request"),
    _401("Unauthorized"),
    _403("Forbidden"),
    _404("Not Found"),
    _405("Method Not Allowed"),
    _406("Not Acceptable"),
    _407("Proxy Authentication Required"),
    _408("Request Timeout"),
    _409("Conflict"),
    _410("Gone"),
    _411("Length Required"),
    _412("Precondition Failed"),
    _413("Payload Too Large"),
    _414("URI Too Long"),
    _415("Unsupported Media Type"),
    _416("Range Not Satisfiable"),
    _417("Expectation Failed"),
    _418("I'm a teapot"),
    _421("Misdirected Request"),
    _422("Unprocessable Content (WebDAV)"),
    _423("Locked (WebDAV)"),
    _424("Failed Dependency (WebDAV)"),
    _425("Too Early Experimental"),
    _426("Upgrade Required"),
    _428("Precondition Required"),
    _429("Too Many Requests"),
    _431("Request Header Fields Too Large"),
    _451("Unavailable For Legal Reasons"),
    _500("Internal Server Error"),
    _501("Not Implemented"),
    _502("Bad Gateway"),
    _503("Service Unavailable"),
    _504("Gateway Timeout"),
    _505("HTTP Version Not Supported"),
    _506("Variant Also Negotiates"),
    _507("Insufficient Storage (WebDAV)"),
    _508("Loop Detected (WebDAV)"),
    _510("Not Extended"),
    _511("Network Authentication Required");

    final String title;

    HTTPError (String title) {
        this.title = title;
    }

    public String getTitle () {
        return title;
    }
}
