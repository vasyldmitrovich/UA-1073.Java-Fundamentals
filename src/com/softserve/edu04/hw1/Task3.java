package com.softserve.edu04.hw1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Select number of your HTTP Error:");
        System.out.println("1 - HTTP_400;");
        System.out.println("2 - HTTP_401;");
        System.out.println("3 - HTTP_402.");
        int selectError = scanner.nextInt();

        switch (selectError) {
            case 1:
                System.out.println(HTTPEror.HTTP_400.error);
                break;

            case 2:
                System.out.println(HTTPEror.HTTP_401.error);
                break;
            case 3:
                System.out.println(HTTPEror.HTTP_402.error);
        }

    }

    enum HTTPEror {
        HTTP_400("Bad Request"),
        HTTP_401("Unauthorized"),
        HTTP_402("Payment Required");

        final String error;


        HTTPEror(String error) {
            this.error = error;
        }
    }
}

