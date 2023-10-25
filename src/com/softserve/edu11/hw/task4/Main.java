package com.softserve.edu11.hw.task4;

import com.softserve.edu11.CommonTools;

public class Main {
    public static void main(String[] args) {
        Task4 container = new Task4();
        readName(container);
        System.out.println(container.getGreeting());
    }

    private static void readName(Task4 container){
        while (true){
            String firstName = CommonTools.readLine("Enter a first name: ");
            String lastName = CommonTools.readLine("Enter a last name: ");

            try {
                if(container.inputData(firstName, lastName)){
                    break;
                }
            } catch (NameException e) {
                System.out.println(e.getMessage());
                System.out.println("Try again...");
            }
        }
    }
}
