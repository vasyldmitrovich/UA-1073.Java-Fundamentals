package com.softserve.edu11.hw.task4;

import java.util.Random;

public class Task4 {
    private static final String PATTERN_NAME = "[a-zA-Z-\\s]+";
    private static final String EXCEPTION_TEXT = "The entered data must contain only English letters, spaces and hyphens.";
    private static final Random RANDOM = new Random();
    private static final String[] GREETING_TEMPLATES = {
            "Hello, %s %s! Wishing you a day filled with joy and success.",
            "Greetings, %s %s! May your path be lined with achievements and happiness.",
            "Hi %s %s, hope your day is as bright as your smile.",
            "Warmest greetings, %s %s! May today bring you closer to your dreams.",
            "Hey there, %s %s! Sending positive vibes your way for a fantastic day ahead."
    };

    private String firstName;
    private String lastName;

    public Task4() {
        firstName = "N/A";
        lastName = "N/A";
    }

    public boolean inputData(String firstName, String lastName) throws NameException {
        if(!firstName.matches(PATTERN_NAME)){
            throw new NameException("The first name you entered does not match the following template. " + EXCEPTION_TEXT);
        }
        else if(!lastName.matches(PATTERN_NAME)){
            throw new NameException("The last name you entered does not match the following template. " + EXCEPTION_TEXT);
        }

        this.firstName = firstName;
        this.lastName = lastName;

        return true;
    }

    public String getGreeting(){
        String greeting = GREETING_TEMPLATES[RANDOM.nextInt(0, GREETING_TEMPLATES.length)];
        return String.format(greeting, firstName, lastName);
    }
}
