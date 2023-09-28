package com.softserve.edu04.hw.Task3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of error (401, 405, 500)");
        int answer = scanner.nextInt();
        HTTPError problem = HTTPError.fintError(answer);

        if (problem != null) {
            System.out.println("The problem is: " + problem.getProblemName());
        } else {
            System.out.println("Problem is not found");
        }
    }
}
