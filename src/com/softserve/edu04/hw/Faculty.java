package com.softserve.edu04.hw;

import java.util.Scanner;

class Faculty {
    private final String name;
    private final int numberOfStudents;
    private final Season season;

    enum Season {
        FIRST,
        SECOND,
        THIRD,
        FOURTH,
        FIFTH
    }

    private Faculty(String name, int numberOfStudents, Season season) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.season = season;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                ", season=" + season +
                '}';
    }

    static Faculty createFaculty() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, we will create new faculty. \nPlease input faculty Name:");
        String tempName = sc.nextLine();
        System.out.println("Input number of students:");
        int tempNumberOfStudents = sc.nextInt();
        System.out.println("Input Season (between 1, 2, 3, 4, 5):");
        int rrr = sc.nextInt();
        switch (rrr) {
            case 1 -> {
                return new Faculty(tempName, tempNumberOfStudents, Season.FIRST);
            }
            case 2 -> {
                return new Faculty(tempName, tempNumberOfStudents, Season.SECOND);
            }
            case 3 -> {
                return new Faculty(tempName, tempNumberOfStudents, Season.THIRD);
            }
            case 4 -> {
                return new Faculty(tempName, tempNumberOfStudents, Season.FOURTH);
            }
            default -> {
                return new Faculty(tempName, tempNumberOfStudents, Season.FIFTH);
            }

        }
    }




    static Faculty test() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, we will create new faculty. \nPlease input faculty Name:");
        String tempName = sc.nextLine();
        System.out.println("Input number of students:");
        int tempNumberOfStudents = sc.nextInt();
        System.out.println("Input Season (between 1, 2, 3, 4, 5):");
        String rrr = sc.nextLine().toUpperCase();
        switch (rrr) {
            case "FIRST" -> {
                return new Faculty(tempName, tempNumberOfStudents, Season.FIRST);
            }
            case "SECOND" -> {
                return new Faculty(tempName, tempNumberOfStudents, Season.SECOND);
            }
            case "THIRD" -> {
                return new Faculty(tempName, tempNumberOfStudents, Season.THIRD);
            }
            case "FOURTH" -> {
                return new Faculty(tempName, tempNumberOfStudents, Season.FOURTH);
            }
            default -> {
                return new Faculty(tempName, tempNumberOfStudents, Season.FIFTH);
            }

        }
    }


}
