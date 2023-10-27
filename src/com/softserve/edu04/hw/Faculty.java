package com.softserve.edu04.hw;

import java.util.InputMismatchException;

import static com.softserve.edu04.hw.App.SCANNER;

enum FacultySeason {
    NONE("None"),
    WINTER("Winter"),
    SUMMER("Summer"),
    AUTUMN("Autumn"),
    SPRING("Spring");

    final String en;

    FacultySeason (String en) {
        this.en = en;
    }

    public String getEn () {
        return en;
    }
}

public class Faculty {
    private int countStudents;
    private FacultySeason season;

    public Faculty () {
        this(0, FacultySeason.NONE);
    }

    public Faculty (int countStudents, FacultySeason season) {
        this.countStudents = countStudents;
        this.season = season;
    }

    public static void promptParameters (Faculty faculty) {
        System.out.println("Enter count of students");
        int countStudents = 0;

        while (true) {
            try {
                countStudents = SCANNER.nextInt();
                SCANNER.nextLine();
                break;
            } catch (InputMismatchException e) {
                e.printStackTrace();
                SCANNER.nextLine();
            }
        }

        faculty.setCountStudents(countStudents);

        System.out.println("Enter season");
        String season = SCANNER.nextLine();

        try {
            FacultySeason seasonObj = FacultySeason.valueOf(season.toUpperCase());
            faculty.setSeason(seasonObj);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error while getting season info");
        }
    }

    public int getCountStudents () {
        return countStudents;
    }

    public void setCountStudents (int countStudents) {
        this.countStudents = countStudents;
    }

    public FacultySeason getSeason () {
        return season;
    }

    public void setSeason (FacultySeason season) {
        this.season = season;
    }

    @Override
    public String toString () {
        return "Faculty{" +
                "countStudents=" + countStudents +
                ", season=" + season.getEn() +
                '}';
    }
}