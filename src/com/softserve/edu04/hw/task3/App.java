package com.softserve.edu04.hw.task3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        inputAndPrint();
    }

    public static void inputAndPrint() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter error: ");
        String status = scanner.nextLine();

        outputDetails(status);

    }
    public static void outputDetails(String status) {
        switch (status) {
            case "400" -> System.out.println(HTTPError.BAD_REQUEST);
            case "401" -> System.out.println(HTTPError.UNAUTHORIZED);
            case "402" -> System.out.println(HTTPError.PAYMENT_REQUIRED);
            case "403" -> System.out.println(HTTPError.FORBIDDEN);
            case "404" -> System.out.println(HTTPError.NOT_FOUND);
            case "405" -> System.out.println(HTTPError.METHOD_NOT_ALLOWED);
            case "406" -> System.out.println(HTTPError.NOT_ACCEPTABLE);
            case "407" -> System.out.println(HTTPError.REQUEST_TIMEOUT);
            case "408" -> System.out.println(HTTPError.CONFLICT);
            case "409" -> System.out.println(HTTPError.GONE);
            default -> System.out.println("Enter a valid status.");
        }
    }//Very nice
}
