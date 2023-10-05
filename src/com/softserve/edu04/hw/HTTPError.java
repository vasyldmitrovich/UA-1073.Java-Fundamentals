package com.softserve.edu04.hw;

import java.util.Scanner;

enum HTTPError {
    BR (400, "Bad Request"),
    UA (401, "Unauthorized"),
    PR (402, "Payment Required"),
    FB (403, "Forbidden"),
    NF (404, "Not Found");

    private final int errorNumber;
    private final String errorName;

    HTTPError(int errorNumber, String errorName) {
        this.errorNumber = errorNumber;
        this.errorName = errorName;
    }

    static void getNameByNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of HTTP error (between 400, 401, 402, 403, 404):");
        int scInt = sc.nextInt();
        String result = switch (scInt) {
            case 400 -> BR.errorName;
            case 401 -> UA.errorName;
            case 402 -> PR.errorName;
            case 403 -> FB.errorName;
            case 404 -> NF.errorName;
            default -> "I don't know such error";
        };
        System.out.println("You chose error " + scInt + " - \"" + result + "\"");
    }


}
