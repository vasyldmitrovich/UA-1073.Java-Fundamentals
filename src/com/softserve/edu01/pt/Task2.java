package com.softserve.edu01.pt;

import com.softserve.common_tools.CommonTools;

public class Task2 {
    public void readPersonInfo(){
        System.out.println("Task #2");
        System.out.println("What is your name?");

        String name = CommonTools.readLine("Answer: ");

        System.out.printf("Where do you live, %s?%n", name);
        String address = CommonTools.readLine("Answer: ");

        System.out.println("\nFull information:");
        System.out.printf("Your name is: %s%n", name);
        System.out.printf("Your address: %s%n", address);

        System.out.println("\n\n");
    }
}
