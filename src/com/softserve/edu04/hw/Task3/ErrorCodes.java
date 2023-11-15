package com.softserve.edu04.hw.Task3;

public enum ErrorCodes {
    // Define enum constants with associated error code and error name.
    HTTP_400(400, "Bad Request"),
    HTTP_401(401, "Unauthorized"),
    HTTP_402(402, "Payment Required"),
    HTTP_204(204, "No Content"),
    HTTP_404(404, "Not Found"),
    HTTP_406(406, "Not Acceptable"),
    HTTP_409(409, "Conflict"),

    // Define a special UNKNOWN_ERROR constant
    UNKNOWN_ERROR(-1, "Unknown Error");

    // Declare instance variables to store error code and error name for each enum constant.
    private final int errorCode;
    private final String errorName;

    // Constructor for ErrorCodes
    ErrorCodes(int errorCode, String errorName) {
        this.errorCode = errorCode;
        this.errorName = errorName;
    }

    // Getter
    public int getErrorCode() {
        return errorCode;
    }

    // Getter
    public String getErrorName() {
        return errorName;
    }

    // Static method to convert an error code into the corresponding ErrorCodes enum constant.
    public static ErrorCodes fromErrorCode(int errorCode) {
        for (ErrorCodes error : ErrorCodes.values()) {
            if (error.getErrorCode() == errorCode) {
                return error;
            }
        }
        return UNKNOWN_ERROR; // If no match is found, return the UNKNOWN_ERROR constant.
    }
}