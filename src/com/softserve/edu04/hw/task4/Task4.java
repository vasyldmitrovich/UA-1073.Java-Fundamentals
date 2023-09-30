package com.softserve.edu04.hw.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name season: ");
        String season = scanner.nextLine();

        System.out.println("Input students number: ");
        int people = scanner.nextInt();
        Seasons s = Seasons.valueOf(season);

        Faculty faculty1 = new Faculty(people, s);
        System.out.println(faculty1);
    }
}
