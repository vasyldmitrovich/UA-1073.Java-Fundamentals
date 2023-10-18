package com.softserve.edu09.hw.task2;

import java.util.List;

public record Student(String name, String group, int course, List<Integer> grades) {
    public double averageGrade(){
        double sumGrades = 0;

        for(var grade : grades){
            sumGrades += grade;
        }

        return sumGrades / grades.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (course != student.course) return false;
        if (!name.equals(student.name)) return false;
        if (!group.equals(student.group)) return false;
        return grades.equals(student.grades);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + group.hashCode();
        result = 31 * result + course;
        result = 31 * result + grades.hashCode();
        return result;
    }
}
