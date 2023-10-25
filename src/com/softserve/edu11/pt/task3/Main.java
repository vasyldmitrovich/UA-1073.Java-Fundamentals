package com.softserve.edu11.pt.task3;

import com.softserve.edu11.CommonTools;

public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; ++i){
            System.out.println("The username should be between 3 to 15 characters and can contain only Latin alphabet, numbers, and underscores.");
            String name = CommonTools.readLine(String.format("Enter a name #%d: ", i));

            var isValid = Task3.isValidName(name);

            System.out.printf("%s%n%n", isValid
                    ? "Your name is correct."
                    : "Your name is not correct.");

        }
    }
}
