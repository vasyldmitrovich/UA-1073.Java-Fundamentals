package com.softserve.edu04.hw.task3;
import com.softserve.edu04.hw.task3.HTTPError;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {//Good
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input error number");
        String errorNumber ="error" + scanner.nextInt();
        HTTPError error = HTTPError.valueOf(errorNumber.toUpperCase());
        System.out.println("This error called " + error.errorName);
    }
}
