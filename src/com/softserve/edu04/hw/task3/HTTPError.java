package com.softserve.edu04.hw.task3;

public enum HTTPError {
    _410("Gone. This response is sent when the requested content has been permanently deleted from server, with no forwarding address."),
    _411("Length Required. Server rejected the request because the Content-Length header field is not defined and the server requires it."),
    _412("Precondition Failed. The client has indicated preconditions in its headers which the server does not meet." ),
    _413("Payload Too Large. Request entity is larger than limits defined by server.");

    final String answer;

    HTTPError(String answer) {
        this.answer = answer;
    }
}

