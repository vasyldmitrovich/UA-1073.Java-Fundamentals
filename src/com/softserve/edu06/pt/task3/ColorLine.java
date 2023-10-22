package com.softserve.edu06.pt.task3;

public class ColorLine extends Line{
    private String color;

    public ColorLine(Point pointFirst, Point pointSecond, String color) {
        super(pointFirst, pointSecond);
        this.color = color;
    }

    @Override
    protected StringBuilder createInfo(){
        StringBuilder builder = super.createInfo();

        builder.append(String.format("Line color: %s.%n", color));

        return builder;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "pointFirst=" + pointFirst +
                ", pointSecond=" + pointSecond +
                ", color=" + color +
                '}';
    }
}
