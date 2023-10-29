package com.softserve.edu01.hw;

import com.softserve.common_tools.CommonTools;

public class Task4 {
    public void exec(){
        System.out.println("Task 4");

        System.out.println("How are you?");
        String name = CommonTools.readLine("Answer: ");

        System.out.printf("You are %s%n", name);

        System.out.println("\n\n");
    }
}
