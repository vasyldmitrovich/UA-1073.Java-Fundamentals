package com.softserve.edu08.hw;
class Student extends Person implements Cloneable {
    int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }
    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clone should be supported for Student.");
        }
    }
}

public class Students {
    public static void main(String[] args) {
        Student student1 = new Student(new FullName("Pyvovarov", "Maksym"), 18, 2);
        Student student2 = new Student(new FullName("Sokalskiy", "Rostyslav"), 18, 2);

        System.out.println("Student 1 Info: " + student1.info());
        System.out.println("Student 1 Activity: " + student1.activity());
        System.out.println("Student 2 Info: " + student2.info());
        System.out.println("Student 2 Activity: " + student2.activity());

        Student student3 = student1.clone();
        student3.course = 4;

        System.out.println("Student 1 Info (After Clone): " + student1.info());
        System.out.println("Student 3 Info (Cloned and Course Changed): " + student3.info());
    }
}
