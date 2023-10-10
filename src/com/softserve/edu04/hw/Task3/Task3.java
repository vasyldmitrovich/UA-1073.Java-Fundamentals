package com.softserve.edu04.hw.Task3;

import java.util.Scanner;

public class Task3 {
    public static void main() {
        var scanner = new Scanner(System.in);
        System.out.println("Select number of your HTTP Error:");
        System.out.println("1 - HTTP_400;");
        System.out.println("2 - HTTP_401;");
        System.out.println("3 - HTTP_402.");
        int selectError = scanner.nextInt();

        switch (selectError) {
            case 1:
                System.out.println(HTTPError.HTTPEror.HTTP_400.error);
                break;

            case 2:
                System.out.println(HTTPError.HTTPEror.HTTP_401.error);
                break;
            case 3:
                System.out.println(HTTPError.HTTPEror.HTTP_402.error);
        }

    }

}
