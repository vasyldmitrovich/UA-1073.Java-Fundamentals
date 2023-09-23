package com.softserve.edu03.hw.Task3;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person[] person = new Person[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter informanion for "+(i+1)+" person");
            person[i] = new Person();
            person[i].input();
        }

        for (int i = 0; i < 5; i++) {
            person[i].output();
        }
    }
}
