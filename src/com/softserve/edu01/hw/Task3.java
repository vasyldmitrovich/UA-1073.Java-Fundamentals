package com.softserve.edu01.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void task() throws IOException {
        double c1, c2, c3;
        double t1, t2, t3;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a first call cost per minute: ");
        c1 = Double.parseDouble(br.readLine());
        System.out.print("Enter a second call cost per minute: ");
        c2 = Double.parseDouble(br.readLine());
        System.out.print("Enter a third call cost per minute: ");
        c3 = Double.parseDouble(br.readLine());
        System.out.print("Enter a first call duration (in minute): ");
        t1 = Double.parseDouble(br.readLine());
        System.out.print("Enter a second call duration (in minute): ");
        t2 = Double.parseDouble(br.readLine());
        System.out.print("Enter a third call duration (in minute): ");
        t3 = Double.parseDouble(br.readLine());
        System.out.println("The cost of the first call: " + c1 * t1 + "$.");
        System.out.println("The cost of the second call: " + c2 * t2 + "$.");
        System.out.println("The cost of the third call: " + c3 * t3 + "$.");
    }
}