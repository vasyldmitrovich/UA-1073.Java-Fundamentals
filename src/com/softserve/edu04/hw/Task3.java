package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task3 {
    private static final String ERROR_PREFIX = "E";
    public static void getInfoError(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the error number: ");
        int code = scanner.nextInt();

        try{
            HTTPError error = HTTPError.valueOf(ERROR_PREFIX+code);
            System.out.printf("The following error exists under the specified number: %s", error.getTextError());
        }
        catch (Exception ignore){
            System.out.println("There is no information about the error under the specified number.");
        }
    }
}

enum HTTPError{
    E400("Bad Request"),
    E401("Unauthorized"),
    E402("Payment Required"),
    E403("Forbidden"),
    E404("Not Found"),
    E405("Method Not Allowed"),
    E406("Not Acceptable"),
    E407("Proxy Authentication Required"),
    E408("Request Timeout"),
    E409("Conflict"),
    E410("Gone"),
    E411("Length Required"),
    E412("Precondition Failed");

    private final String textError;

    HTTPError(String textError){
        this.textError = textError;
    }

    public String getTextError() {
        return textError;
    }
}
