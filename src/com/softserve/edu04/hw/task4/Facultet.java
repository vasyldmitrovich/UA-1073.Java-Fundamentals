package com.softserve.edu04.hw.task4;
public class Facultet {

    private int numOfStud;
    private Season whichSeason;

    public Facultet(int numOfStud, Season whichSeason) {
        this.numOfStud = numOfStud;
        this.whichSeason = whichSeason;
    }

    @Override
    public String toString() {
        return "Facultet{" +
                "numOfStud=" + numOfStud +
                ", whichSeason=" + whichSeason +
                '}';
    }

    //Add constructor without parameters and getters and setters
}
