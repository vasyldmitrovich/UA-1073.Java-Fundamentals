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

    public Facultet() {
    }

    public int getNumOfStud() {
        return numOfStud;
    }

    public void setNumOfStud(int numOfStud) {
        this.numOfStud = numOfStud;
    }

    public Season getWhichSeason() {
        return whichSeason;
    }

    public void setWhichSeason(Season whichSeason) {
        this.whichSeason = whichSeason;
    }
    //Add constructor without parameters and getters and setters
}
