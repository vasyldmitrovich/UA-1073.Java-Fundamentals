package com.softserve.edu01.pt;

import java.io.IOException;
import java.util.Scanner;

public class Task_4 {
    public static void task4()  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How are you?");
        String answer = scanner.nextLine();
        System.out.println("You are " + answer);
    }
}
