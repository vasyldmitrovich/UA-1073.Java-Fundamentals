package com.softserve.edu06.pt.task3;

public class Line {
    protected Point pointFirst;
    protected Point pointSecond;

    public Line(Point pointFirst, Point pointSecond) {
        this.pointFirst = pointFirst;
        this.pointSecond = pointSecond;
    }

    public void print(){
        StringBuilder info = createInfo();
        System.out.println(info.toString());
    }

    protected StringBuilder createInfo(){
        StringBuilder builder = new StringBuilder();

        builder.append("Line coordinates:\n");
        builder.append(String.format("\tA = %s%n", pointFirst));
        builder.append(String.format("\tB = %s%n", pointSecond));

        return builder;
    }

    @Override
    public String toString() {
        return "Line{" +
                "pointFirst=" + pointFirst +
                ", pointSecond=" + pointSecond +
                '}';
    }
}
