package com.softserve.edu01.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main (String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("What is your name?");
            String name = scanner.readLine();

            System.out.println("Where do you live?");
            String address = scanner.readLine();

            System.out.printf("Your name is %s%n", name);
            System.out.printf("Your address is %s%n", address);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
