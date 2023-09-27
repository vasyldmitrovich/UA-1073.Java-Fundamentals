/*package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number representing an HTTP error: ");
        String errorNumber = scanner.nextLine();
        nameError nameError = nameError.valueOf(errorNumber.toUpperCase());
        System.out.println(errorNumber + "HTTPError: " + nameError);

    }
}
enum nameError {
    BadRequest, Unauthorized, PaymentRequired, Forbidden, NotFound
}
enum errorNumber {
    BadRequest(nameError.400);
    Unauthorized(nameError.401);
    PaymentRequired(nameError.402);
    Forbidden(nameError.403);
    NotFound(nameError.404);
    errorNumber(nameError NameError) {
        this.nameError = nameError;
    }
}*/
