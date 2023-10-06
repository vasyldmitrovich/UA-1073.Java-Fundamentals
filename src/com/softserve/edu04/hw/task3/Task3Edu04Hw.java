package com.softserve.edu04.hw.task3;

import java.util.Scanner;

public class Task3Edu04Hw {
    public static void task3Edu04Hw() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input your number error from 410 to 413: " );
        int nunberError = scan.nextInt();//Maybe number
        HTTPError error = HTTPError.valueOf("_" + nunberError);
        System.out.println("Your error: " + nunberError + "-" + error.answer);
    }
}
