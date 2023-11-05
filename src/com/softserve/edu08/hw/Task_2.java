package com.softserve.edu08.hw;


public class Task_2  {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student students1 = new Student(new FullName("Bob", "Mark"), 22,3);
        Student students2 = new Student(new FullName("Ann", "Abramova"), 18,1);

        System.out.println(students1.info());
        System.out.println(students1.activity());
        System.out.println(students2.info());
        System.out.println(students2.activity());
        Student students3 = students2.clone();
        students3.courseNumber = 4;
        System.out.println(students1.info());
        System.out.println(students1.activity());
        System.out.println(students2.info());
        System.out.println(students2.activity());
        System.out.println(students3.info());
        System.out.println(students3.activity());


    }
}


class Student extends Person implements Cloneable{

    int courseNumber;

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public Student(FullName fullName, int age, int courseNumber) {
        super(fullName, age);
        this.courseNumber = courseNumber;
    }

    String info(){
        return "FirstName: " + fullName.getFirstName()
                + " LastName: " + fullName.getLastName() + " Age: " + getAge() + " Course Number: " + getCourseNumber();
    }



    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
