package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class StudentService {

    public static double averageGrade(List<Integer> grades){
        double sum = 0;
        for (int el: grades) {
            sum += el;
        }
        return sum / grades.size();
    }

    public static void removeGradeLess3(List<Student> students) {
        List<Student> temList = new ArrayList<>(students);
        Student tempStudent;
        Iterator<Student> iterator = temList.iterator();

        while (iterator.hasNext()) {
            tempStudent = iterator.next();
            if (averageGrade(tempStudent.getGrades())
                    < 3){
                students.remove(tempStudent);
            } else {
                students.get(students.indexOf(tempStudent)).setCourse(tempStudent.getCourse() + 1);
            }
        }
    }

    public static void printStudents(List<Student> students, int course){
        for (Student st: students) {
            if (st.getCourse() == course) {
                System.out.println(st.getName());
            }
        }
    }
}
