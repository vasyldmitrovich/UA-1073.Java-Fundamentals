package com.softserve.edu03.pt;

import static com.softserve.edu03.pt.App.SCANNER;

public class Student {
    private String name;
    private double rating;

    static private double totalRating;

    static private int totalStudents;

    public Student () {
        this("N/A", 0.0);
    }

    public Student (String name, double rating) {
        this.name = name;
        this.rating = rating;
        totalRating += rating;
        totalStudents++;
    }

    public static double avgRating() {
        return totalRating / totalStudents;
    }

    public static double getTotalRating() {
        return totalRating;
    }

    public static void printUserStats () {
        System.out.println("Total rating = " + Student.getTotalRating());
        System.out.println("Average rating = %.3f".formatted(Student.avgRating()));
    }

    static void promptParameters(Student student) {
        System.out.println("Input name: ");

        String name = SCANNER.nextLine();
        student.setName(name);

        System.out.println("Input rating for student " + student.getName() + ":");

        double rating = SCANNER.nextDouble();
        SCANNER.nextLine();
        student.setRating(rating);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        totalRating -= this.rating;
        this.rating = rating;
        totalRating += rating;
    }

    /**
     * Compare my rating with other's
     * @param student - the other student to compare with
     * @return - whether I am better than the other student
     */

    public boolean betterStudent(Student student) {
        return this.rating > student.rating;
    }

    @Override
    public String toString () {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
