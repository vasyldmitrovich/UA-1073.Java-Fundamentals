package com.softserve.edu13.hw;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class hw2 {
    public static void main(String[] args) {
        String dateToValidate = "12.31.21";
        boolean isValid = validateDate(dateToValidate);
        if (isValid) {
            System.out.println(dateToValidate + " is a valid date.");
        } else {
            System.out.println(dateToValidate + " is not a valid date.");
        }
    }

    private static boolean validateDate(String dateToValidate) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yy");
        sdf.setLenient(false);
        try {
            sdf.parse(dateToValidate);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}

