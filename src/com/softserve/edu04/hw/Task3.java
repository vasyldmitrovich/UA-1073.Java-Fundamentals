package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task3 {
    public static void task3() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number representing an HTTP error: ");
        int errorNumber = 0;
        while (true) {
            try {
                errorNumber = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Wrong number! Try again.");
                sc.nextLine();
            }
        }

        HTTPError error = switch (errorNumber) {
            case 400 -> HTTPError.BAD_REQUEST;
            case 401 -> HTTPError.UNAUTHORIZED;
            case 402 -> HTTPError.PAYMENT_REQUIRED;
            case 403 -> HTTPError.FORBIDDEN;
            case 404 -> HTTPError.NOT_FOUND;
            case 405 -> HTTPError.METHOD_NOT_ALLOWED;
            case 406 -> HTTPError.NOT_ACCEPTABLE;
            default -> throw new Exception("Wrong error number!");//Good
        };
        System.out.printf("Name of the error %d: " + error.errorMessage, errorNumber);

    }
}
