package com.softserve.edu09.hw.task2;

import java.util.Arrays;

public class Student {
    private String name;

    private String group;

    private int course;
    private Grades grades[];

    public static class Grades {

        private String subject;
        private int mark;

        public Grades(String subject, int mark) {
            this.subject = subject;
            this.mark = mark;
        }

        @Override
        public String toString() {
            return "Grades{" +
                    "subject='" + subject + '\'' +
                    ", mark=" + mark +
                    '}';
        }

    }

    public Student(String name, String group, int course, Grades[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }

    public double getAvgGrade() {
        int sum = 0;
        for (var grade : grades) {
            sum += grade.mark;
        }
        return (double) sum / grades.length;
    }

    public void promoteToNextCourseLevel() {
        course++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Grades[] getGrades() {
        return grades;
    }

    public void setGrades(Grades[] grades) {
        this.grades = grades;
    }
}
