package com.softserve.edu09.hw.task2;

import java.util.HashSet;
import java.util.Set;

public class University {
    private static final double AVERAGE_GRADE = 3.0;

    private final Set<Student> students;

    public University() {
        students = new HashSet<>();
    }

    public University(Set<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void removeStudentsBelowAverage(){
        students.removeIf(student -> student.averageGrade() < AVERAGE_GRADE);
    }

    public void printStudents(int course){
        boolean hasStudent = students.stream()
                .anyMatch(student -> student.course() == course);

        if(!hasStudent){
            System.out.println("Nothing was found for your search");
            return;
        }

        for(var student : students){
            if(student.course() == course){
                System.out.println("Name: " + student.name());
            }
        }
    }
}
