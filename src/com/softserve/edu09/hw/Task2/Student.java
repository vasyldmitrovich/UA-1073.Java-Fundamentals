package com.softserve.edu09.hw.Task2;

import java.util.List;
import java.util.Scanner;

public class Student {
    private  String name;
    private int group;
    private int course;
    private int mathGrade;
    private int englishGrade;
    private int literatureGrade;


    public Student(String name, int group, int course, int mathGrade, int englishGrade, int literatureGrade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.literatureGrade = literatureGrade;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        this.englishGrade = englishGrade;
    }

    public int getLiteratureGrade() {
        return literatureGrade;
    }

    public void setLiteratureGrade(int literatureGrade) {
        this.literatureGrade = literatureGrade;
    }

    public double avarageGrade () {
      return   ((getEnglishGrade()+getEnglishGrade()+getMathGrade())/(double)3);
    }
    public boolean isPromotedToTheNextCourse () {
        if (avarageGrade()>3) {
            return true;
        } else {
            return false;
        }
    }
    public static void onNextCourseList (List<Student> studentList) {
        for (int i = 0; i < studentList.size(); i++) {
            if (!studentList.get(i).isPromotedToTheNextCourse()) {
                System.out.println(studentList.get(i).getName() + " with average grade " +  (studentList.get(i).avarageGrade()) + " was removed");
                studentList.remove(i);
            }
        }
    }
    public static int askForCourseNumber () {
        System.out.println("Input course number");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }
    public static void printStudents(List<Student> studentList, int course) {
        for (int i = 0; i < studentList.size(); i++) {
            if (course == 1 || course == 2) {
                if (studentList.get(i).getCourse() == course) {
                    System.out.println(studentList.get(i).getName() + " with average grade " + (studentList.get(i).avarageGrade()));
                }
            } else {
                System.out.println("No course with this number");
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", mathGrade=" + mathGrade +
                ", englishGrade=" + englishGrade +
                ", literatureGrade=" + literatureGrade +
                '}';
    }
}
