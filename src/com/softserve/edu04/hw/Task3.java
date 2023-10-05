package com.softserve.edu04.hw;

public class Task3 {
    enum HTTPError {
        HTTP_400("помилковий запит"),
        HTTP_401("неможливий запит"),
        HTTP_402("дані відхилено");

        private final String errorMessage;
        HTTPError(String errorMessage) {
            this.errorMessage = errorMessage;
        }
        public String getErrorMessage() {
            return errorMessage;
        }

    }
    public static void main(String[] args) {
        System.out.print("Введіь число яке показує помилку HTTP:");
        int errorCode = Integer.parseInt(System.console().readLine());

        HTTPError[] httpErrors = HTTPError.values();
        boolean found = false;

        for (HTTPError error : httpErrors) {
            if (error.ordinal() == errorCode) {
                System.out.println("Назва помилки HTTP" + errorCode + ":" + error.getErrorMessage());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Назва помилки HTTP" + errorCode + "не знайдено");

        }
    }
}
