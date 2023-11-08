package com.softserve.edu11.pt.task2;

public class App {
    public static void main(String[] args) {
        String fistName = "Oleh";
        String lastName = "Soltysyak";
        String middleName = "Ruslanovych";

        System.out.printf("%s %s. %s.%n",
                lastName, fistName.charAt(0),
                middleName.charAt(0));
        System.out.printf("%s %n",
                fistName);
        System.out.printf("%s %s %s",
                fistName, middleName, lastName);


    }
}
