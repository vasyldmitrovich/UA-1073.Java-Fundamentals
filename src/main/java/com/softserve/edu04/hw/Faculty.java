package com.softserve.edu04.hw;

import java.util.Scanner;

public class Faculty {
    private int countStudents;
    private Season season;

    public Faculty() {
        season = Season.NONE;
    }

    public Faculty(int countStudents, Season season) {
        this.countStudents = countStudents;
        this.season = season;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        int countStudent;
        String enterSeason;

        System.out.print("Enter the season: ");
        enterSeason = scanner.nextLine();
        enterSeason = enterSeason.replace(" ", "_");

        System.out.print("Enter the number of students: ");
        countStudent = scanner.nextInt();

        setCountStudents(countStudent);
        setSeason(Season.valueOf(enterSeason.toUpperCase()));
    }

    public int getCountStudents() {
        return countStudents;
    }

    public void setCountStudents(int countStudents) {
        this.countStudents = countStudents;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public String getInfo(){
        return toString();
    }

    @Override
    public String toString() {
        return String.format("Count of students: %d. Season: %s.", countStudents, season.getTitleEn());
    }
}

enum Season{
    NONE("N/A"),
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    private final String titleEn;

    Season(String titleEn){
        this.titleEn = titleEn;
    }

    public String getTitleEn(){
        return titleEn;
    }
}