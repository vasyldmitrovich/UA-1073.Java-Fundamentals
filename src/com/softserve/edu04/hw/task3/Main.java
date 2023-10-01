package com.softserve.edu04.hw.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the HTTP error code: ");

        int errorCode = scanner.nextInt();
        HTTPError error = HTTPError.findError(errorCode);

        if (error != null) {
            System.out.println("HTTP Error " + errorCode + ": " + error.getName());
        } else {
            System.out.println("HTTP Error with code " + errorCode + " not found.");
        }

    }
}

enum HTTPError {
    HTTP_400(400, "Bad Request"),
    HTTP_401(401, "Unauthorized"),
    HTTP_402(402, "Payment Required"),
    HTTP_403(403, "Forbidden"),
    HTTP_404(404, "Not Found");

     final int code;
     final String name;   //чи обов'язково тут private?

    HTTPError(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static HTTPError findError(int code) {
        for (HTTPError httpError : values()) {
            if (httpError.getCode() == code) {
                return httpError;
            }
        }
        return null; // Помилка з таким кодом не знайдена
    }
}
