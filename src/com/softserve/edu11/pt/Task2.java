package com.softserve.edu11.pt;

public class Task2 {
    public static void main(String[] args) {
        String firstName = "James";
        String lastName = "Bond";
        String middleName = "Yuriyovych";

        System.out.printf("%s %s. %s.%n",
                lastName, firstName.charAt(0),
                middleName.charAt(0));
        System.out.printf("%s %s %s",
                firstName, middleName, lastName);
    }


}
