package com.softserve.edu04.hw;

public class Faculty {
    private int numberOfStudents;
    private Season currentSeason;

    public Faculty(int numberOfStudents, Season currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    public Faculty() {
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) throws Exception {//Ok
        if (numberOfStudents < 0) {
            throw new Exception("Number of students can`t be negative!");
        } else {
            this.numberOfStudents = numberOfStudents;
        }
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(Season currentSeason) {
        this.currentSeason = currentSeason;
    }
}
