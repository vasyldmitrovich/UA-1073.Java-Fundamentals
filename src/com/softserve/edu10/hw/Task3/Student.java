package com.softserve.edu10.hw.Task3;

import java.util.*;

public class Student {
   static Scanner SCANNER = new Scanner(System.in);

    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
   static public void printStudents (List<Student> students, int course) {
       Iterator<Student> iterator = students.iterator();
       while (iterator.hasNext()) {
           Student elem = iterator.next();
           if (elem.getCourse() == course) {
               System.out.println(elem.getName());
           }
       }
    }
    static public int compareByName(List<Student> student) {
        System.out.println("input index of first student to compare");
        int index1 = SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.println("input index of first student to compare");
        int index2 = SCANNER.nextInt();
        SCANNER.nextLine();
        int x = student.get(index1).getName().compareTo(student.get(index2).getName());
        if (x > 0) {
            System.out.println(student.get(index2).getName() + " will be earlier in alphabetical order then " + student.get(index1).getName());
        } else {
            System.out.println(student.get(index1).getName() + " will be earlier in alphabetical order then " + student.get(index2).getName());
        }
        return x;
    }
    static public void compareByCourse(List<Student> student) {
        System.out.println("input index of first student to compare");
        int index1 = SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.println("input index of first student to compare");
        int index2 = SCANNER.nextInt();
        SCANNER.nextLine();
        if (student.get(index1).getCourse() < student.get(index2).getCourse()) {
            System.out.println("First element will be first");
        } else {
            System.out.println("Second element will be first");
        }
    }
static  public void sortName (List<Student> list1) {
    Collections.sort(list1, new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });
    System.out.println(list1);
}
    static  public void sortCourse (List<Student> list1) {
        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getCourse(), o2.getCourse());
            }
        });
        System.out.println(list1);
    }
   static public int promptCourseNumber() {
       System.out.println("Input course number");
        int courseNumber= SCANNER.nextInt();
        SCANNER.nextLine();
        return  courseNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
