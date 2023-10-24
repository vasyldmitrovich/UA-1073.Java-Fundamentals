package com.softserve.edu11.pt.task1;

public class SoftServe {
    public static void task1() {

        String text = "SoftServe Academy";
        String fragment = "Academy";


        if (text.contains(fragment)) {
            System.out.println("The word *" + fragment + "* is contained in a sentence *" + text + "*");
        } else {
            System.out.println("There's no such word");
        }
    }
}
