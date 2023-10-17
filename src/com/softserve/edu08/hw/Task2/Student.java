package com.softserve.edu08.hw.Task2;
import com.softserve.edu08.hw.Task1.FullName;
import com.softserve.edu08.hw.Task1.Person;


public class Student extends Person implements Cloneable {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String info() {
        return"\nFirst Name: " + this.getFullName().getFirstName() +
                ", \nLast Name: " + this.getFullName().getLastName() + ", \nAge: " +
                getAge() + ", \nCourse number: " + course + ",";
    }

    @Override
    public String activity() {
        if (course <= 6) {
            return "Student '" + this.getFullName().getFirstName() + " " +
                    this.getFullName().getLastName() + "' study at university.";
        }
        return "Student '" + this.getFullName().getFirstName() + " " +
                this.getFullName().getLastName() + "' DON`T study at university.";
    }

    public Object clone() throws CloneNotSupportedException {
        Person clonedPerson = (Person) super.clone();
        FullName clonedFullName = new FullName(this.getFullName().getFirstName(), this.getFullName().getLastName());
        clonedPerson.setFullName(clonedFullName);

        return clonedPerson;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }


}
