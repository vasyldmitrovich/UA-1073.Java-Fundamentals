package com.softserve.edu04.hw;

import javax.sound.midi.Soundbank;//Delete this import if you do not use it
import java.util.Scanner;

public class Faculty {
    private int studentsNumber;
    private Season currentSeason;

    public Faculty(int studentsNumber, Season currentSeason) {
        this.studentsNumber = studentsNumber;
        this.currentSeason = currentSeason;
    }

    public int getStudentsNumber() {
        return studentsNumber;
    }

    public void setStudentsNumber(int studentsNumber) {
        this.studentsNumber = studentsNumber;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(Season currentSeason) {
        this.currentSeason = currentSeason;
    }

    public void printValues() {
        System.out.println("Number of students: " + studentsNumber);
        System.out.println("Current season: " + currentSeason.getName());
    }
}
