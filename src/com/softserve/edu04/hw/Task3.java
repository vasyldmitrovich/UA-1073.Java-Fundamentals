package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task3 {
    public static void run() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter HTTP error response number: ");
        int number = console.nextInt();
        HTTPError error = HTTPError.valueOf("_" + number);
        System.out.println("Error message: " + error.message);
    }
}
